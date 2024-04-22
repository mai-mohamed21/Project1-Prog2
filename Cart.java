class Cart {
    private int customerId;
    private int nProducts;
    private Product[] products;
    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = new Product[nProducts];
    }
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setNProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }
    public int getNProducts() {
        return nProducts;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public Product[] getProducts() {
        return products;
    }
    public void addProduct(Product product) {
        for (int i = 0; i < nProducts; i++) {
            if (products[i] == null) {
                products[i] = product;
                break; }
        }
    }
    public void removeProduct(Product product) {
        for (int i = 0; i < nProducts; i++) {
            if (products[i] != null && products[i].getProductId() == product.getProductId()) {
                products[i] = null;
                break;
            }
        }
          }
    public double calculatePrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }
        public void placeOrder() {
            Order order = new Order(customerId, 1, products, calculatePrice());
            order.printOrderInfo();
        }
    }


