package com.itheima.takeout.model.net.bean;

import java.util.List;

/**
 * 服务器回复数据
 */

public class HomeResponseInfo {

    /**
     * code : 0
     * data : {"body":[{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":1,"invoice":"","name":"黑马程序员外卖项目","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/1.png","recentVisit":"","sale":"","score":"5","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":2,"invoice":"","name":"传智播客第2家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":3,"invoice":"","name":"传智播客第3家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":4,"invoice":"","name":"传智播客第4家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":5,"invoice":"","name":"传智播客第5家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":6,"invoice":"","name":"传智播客第6家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":7,"invoice":"","name":"传智播客第7家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":8,"invoice":"","name":"传智播客第8家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":9,"invoice":"","name":"传智播客第9家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":["黄焖鸡","米线","传智播客","黑马程序员","酷丁鱼","博学谷"],"type":1},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":10,"invoice":"","name":"传智播客第10家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":11,"invoice":"","name":"传智播客第11家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":12,"invoice":"","name":"传智播客第12家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":13,"invoice":"","name":"传智播客第13家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":14,"invoice":"","name":"传智播客第14家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":15,"invoice":"","name":"传智播客第15家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":16,"invoice":"","name":"传智播客第16家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":17,"invoice":"","name":"传智播客第17家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":18,"invoice":"","name":"传智播客第18家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":19,"invoice":"","name":"传智播客第19家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0}],"head":{"categorieList":[{"id":1,"name":"美食","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/1.png"},{"id":2,"name":"甜品饮料","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/2.png"},{"id":3,"name":"商店超市","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/3.png"},{"id":4,"name":"早餐","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/4.png"},{"id":5,"name":"果蔬","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/5.png"},{"id":6,"name":"新店","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/6.png"},{"id":7,"name":"下午茶","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/7.png"},{"id":8,"name":"麻辣烫","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/8.png"}],"promotionList":[{"id":1,"info":"promotion info...","pic":"http://172.16.0.116:8080/TakeoutService/imgs/promotion/1.jpg"},{"id":2,"info":"promotion info...","pic":"http://172.16.0.116:8080/TakeoutService/imgs/promotion/2.jpg"},{"id":3,"info":"promotion info...","pic":"http://172.16.0.116:8080/TakeoutService/imgs/promotion/3.jpg"}]}}
     */

    private String code;
    /**
     * body : [{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":1,"invoice":"","name":"黑马程序员外卖项目","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/1.png","recentVisit":"","sale":"","score":"5","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":2,"invoice":"","name":"传智播客第2家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":3,"invoice":"","name":"传智播客第3家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":4,"invoice":"","name":"传智播客第4家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":5,"invoice":"","name":"传智播客第5家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":6,"invoice":"","name":"传智播客第6家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":7,"invoice":"","name":"传智播客第7家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":8,"invoice":"","name":"传智播客第8家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":9,"invoice":"","name":"传智播客第9家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":["黄焖鸡","米线","传智播客","黑马程序员","酷丁鱼","博学谷"],"type":1},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":10,"invoice":"","name":"传智播客第10家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":11,"invoice":"","name":"传智播客第11家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":12,"invoice":"","name":"传智播客第12家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":13,"invoice":"","name":"传智播客第13家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":14,"invoice":"","name":"传智播客第14家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":15,"invoice":"","name":"传智播客第15家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":16,"invoice":"","name":"传智播客第16家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":17,"invoice":"","name":"传智播客第17家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":18,"invoice":"","name":"传智播客第18家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0},{"recommendInfos":[],"seller":{"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":19,"invoice":"","name":"传智播客第19家分店","pic":"","recentVisit":"","sale":"","score":"","sendPrice":0,"time":""},"type":0}]
     * head : {"categorieList":[{"id":1,"name":"美食","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/1.png"},{"id":2,"name":"甜品饮料","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/2.png"},{"id":3,"name":"商店超市","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/3.png"},{"id":4,"name":"早餐","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/4.png"},{"id":5,"name":"果蔬","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/5.png"},{"id":6,"name":"新店","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/6.png"},{"id":7,"name":"下午茶","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/7.png"},{"id":8,"name":"麻辣烫","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/8.png"}],"promotionList":[{"id":1,"info":"promotion info...","pic":"http://172.16.0.116:8080/TakeoutService/imgs/promotion/1.jpg"},{"id":2,"info":"promotion info...","pic":"http://172.16.0.116:8080/TakeoutService/imgs/promotion/2.jpg"},{"id":3,"info":"promotion info...","pic":"http://172.16.0.116:8080/TakeoutService/imgs/promotion/3.jpg"}]}
     */

    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private HeadBean head;
        /**
         * recommendInfos : []
         * seller : {"activityList":[],"deliveryFee":"","distance":"","ensure":"","id":1,"invoice":"","name":"黑马程序员外卖项目","pic":"http://172.16.0.116:8080/TakeoutService/imgs/category/1.png","recentVisit":"","sale":"","score":"5","sendPrice":0,"time":""}
         * type : 0
         */

        private List<BodyBean> body;

        public HeadBean getHead() {
            return head;
        }

        public void setHead(HeadBean head) {
            this.head = head;
        }

        public List<BodyBean> getBody() {
            return body;
        }

        public void setBody(List<BodyBean> body) {
            this.body = body;
        }

        public static class HeadBean {
            /**
             * id : 1
             * name : 美食
             * pic : http://172.16.0.116:8080/TakeoutService/imgs/category/1.png
             */

            private List<CategorieListBean> categorieList;
            /**
             * id : 1
             * info : promotion info...
             * pic : http://172.16.0.116:8080/TakeoutService/imgs/promotion/1.jpg
             */

            private List<PromotionListBean> promotionList;

            public List<CategorieListBean> getCategorieList() {
                return categorieList;
            }

            public void setCategorieList(List<CategorieListBean> categorieList) {
                this.categorieList = categorieList;
            }

            public List<PromotionListBean> getPromotionList() {
                return promotionList;
            }

            public void setPromotionList(List<PromotionListBean> promotionList) {
                this.promotionList = promotionList;
            }

            public static class CategorieListBean {
                private int id;
                private String name;
                private String pic;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }
            }

            public static class PromotionListBean {
                private int id;
                private String info;
                private String pic;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }
            }
        }

        public static class BodyBean {
            /**
             * activityList : []
             * deliveryFee :
             * distance :
             * ensure :
             * id : 1
             * invoice :
             * name : 黑马程序员外卖项目
             * pic : http://172.16.0.116:8080/TakeoutService/imgs/category/1.png
             * recentVisit :
             * sale :
             * score : 5
             * sendPrice : 0
             * time :
             */

            private SellerBean seller;
            private int type;
            private List<?> recommendInfos;

            public SellerBean getSeller() {
                return seller;
            }

            public void setSeller(SellerBean seller) {
                this.seller = seller;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public List<?> getRecommendInfos() {
                return recommendInfos;
            }

            public void setRecommendInfos(List<?> recommendInfos) {
                this.recommendInfos = recommendInfos;
            }

            public static class SellerBean {
                private String deliveryFee;
                private String distance;
                private String ensure;
                private int id;
                private String invoice;
                private String name;
                private String pic;
                private String recentVisit;
                private String sale;
                private String score;
                private int sendPrice;
                private String time;
                private List<?> activityList;

                public String getDeliveryFee() {
                    return deliveryFee;
                }

                public void setDeliveryFee(String deliveryFee) {
                    this.deliveryFee = deliveryFee;
                }

                public String getDistance() {
                    return distance;
                }

                public void setDistance(String distance) {
                    this.distance = distance;
                }

                public String getEnsure() {
                    return ensure;
                }

                public void setEnsure(String ensure) {
                    this.ensure = ensure;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getInvoice() {
                    return invoice;
                }

                public void setInvoice(String invoice) {
                    this.invoice = invoice;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getRecentVisit() {
                    return recentVisit;
                }

                public void setRecentVisit(String recentVisit) {
                    this.recentVisit = recentVisit;
                }

                public String getSale() {
                    return sale;
                }

                public void setSale(String sale) {
                    this.sale = sale;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getSendPrice() {
                    return sendPrice;
                }

                public void setSendPrice(int sendPrice) {
                    this.sendPrice = sendPrice;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public List<?> getActivityList() {
                    return activityList;
                }

                public void setActivityList(List<?> activityList) {
                    this.activityList = activityList;
                }
            }
        }
    }
}
