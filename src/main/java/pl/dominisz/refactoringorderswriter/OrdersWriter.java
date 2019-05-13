package pl.dominisz.refactoringorderswriter;

public class OrdersWriter {
    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");
        sb.append(getContentForOrders());
        return sb.append("]}").toString();
    }

    private String getContentForOrders() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orders.getOrdersCount(); i++) {
            Order order = orders.getOrder(i);
            sb.append(getContentForOrder(order));

            if (i < orders.getOrdersCount() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private String getContentForOrder(Order order) {
        StringBuffer sb = new StringBuffer("{");
        sb.append("\"id\": ");
        sb.append(order.getId());
        sb.append(", ");
        sb.append("\"products\": [");
        sb.append(getContentForProducts(order));
        sb.append("]}");
        return sb.toString();
    }

    private String getContentForProducts(Order order) {
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < order.getProductsCount(); j++) {
            Product product = order.getProduct(j);

            sb.append(getContentForProduct(product));

            if (j < order.getProductsCount() -1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private String getContentForProduct(Product product) {
        StringBuffer sb = new StringBuffer("{");
        sb.append("\"code\": \"");
        sb.append(product.getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(Color.getNameForValue(product.getColor()));
        sb.append("\", ");

        if (product.getSize() != Size.NOT_APPLICABLE.getValue()) {
            sb.append("\"size\": \"");
            sb.append(Size.getNameForValue(product.getSize()));
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(product.getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(product.getCurrency());
        sb.append("\"}");

        return sb.toString();
    }
}