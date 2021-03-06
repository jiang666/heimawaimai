package com.itheima.takeout.model.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 服务器回复数据
 */

public class GoodsResponseInfo {


    /**
     * code : 0
     * data : [{"id":101,"info":"(不与其它活动同享)13.9元特价套餐!!|13.9特价套餐!!(每单仅限2份)","list":[{"bargainPrice":true,"form":"肉末烧汁茄子+千叶豆腐+小食+时蔬+含粗粮米饭)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp","id":1001,"monthSaleNum":53,"name":"肉末烧汁茄子+千叶豆腐套餐(含粗粮米饭)","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"肉末烧汁茄子+榄菜肉末四季豆+小食+时蔬+含粗粮米饭)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp","id":1002,"monthSaleNum":37,"name":"肉末烧汁茄子+四季豆套餐(含粗粮米饭)","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"手撕杏鲍菇+千叶豆腐+小食+时蔬+含粗粮米饭)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp","id":1003,"monthSaleNum":27,"name":"手撕杏鲍菇+千叶豆腐套餐(含粗粮米饭)","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"肉末烧汁茄子+杏鲍菇+小食+时蔬+含粗粮米饭)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp","id":1004,"monthSaleNum":24,"name":"肉末烧汁茄子+杏鲍菇套餐(含粗粮米饭)","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"榄菜肉末四季豆+千叶豆腐+小食+时蔬+含粗粮米饭)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp","id":1005,"monthSaleNum":53,"name":"榄菜肉末四季豆+千叶豆腐套餐(含粗粮米饭)","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"榄菜肉末四季豆+手撕杏鲍菇+小食+时蔬+含粗粮米饭)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp","id":1006,"monthSaleNum":53,"name":"榄菜肉末四季豆+手撕杏鲍菇套餐(含粗粮米饭)","new":false,"newPrice":13.899999618530273,"oldPrice":30}],"name":"13.9特价套餐"},{"id":102,"info":"","list":[{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/mantou.webp","id":1006,"monthSaleNum":54,"name":"纯手工馒头(一个)","new":false,"newPrice":1.5,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/culiangmifan.webp","id":1007,"monthSaleNum":43,"name":"粗粮米饭","new":false,"newPrice":2,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/huangjinyumibing.webp","id":1008,"monthSaleNum":24,"name":"黄金玉米饼(一个)","new":false,"newPrice":3,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/culiangcaituanzi.webp","id":1009,"monthSaleNum":10,"name":"粗粮菜团子(一个)","new":false,"newPrice":6,"oldPrice":0}],"name":"粗粮主食"},{"id":103,"info":"","list":[{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/xipingxiangchang.webp","id":1011,"monthSaleNum":10,"name":"细品香肠","new":false,"newPrice":10,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/hudiechi.webp","id":1012,"monthSaleNum":10,"name":"蝴蝶翅","new":false,"newPrice":10,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/ziranjiliu.webp","id":1013,"monthSaleNum":10,"name":"孜然鸡柳","new":false,"newPrice":10,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/yansuji.webp","id":1014,"monthSaleNum":10,"name":"盐酥鸡","new":false,"newPrice":10,"oldPrice":0}],"name":"佐餐小吃"},{"id":104,"info":"","list":[{"bargainPrice":true,"form":"干烧带鱼+五香香肠+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1015,"monthSaleNum":53,"name":"放心-干烧带鱼套餐","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"细品三杯鸡+五香香肠+鸡蛋羹+小食+清炒时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1016,"monthSaleNum":9,"name":"安心-细品三杯鸡套餐(不含主食)","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"干烧带鱼+五香香肠+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1017,"monthSaleNum":53,"name":"开心-细品红烧肉套餐(不含主食)","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"土豆烧牛肉+五香香肠+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1018,"monthSaleNum":53,"name":"舒心-土豆烧牛肉套餐","new":false,"newPrice":13.899999618530273,"oldPrice":30}],"name":"用心营养套餐（不含主食）"},{"id":105,"info":"","list":[{"bargainPrice":true,"form":"三杯鸡+肉末烧汁茄子+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1019,"monthSaleNum":53,"name":"三杯鸡+肉末烧汁茄子套餐","new":false,"newPrice":22,"oldPrice":30},{"bargainPrice":true,"form":"三杯鸡+榄菜肉末四季豆+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1020,"monthSaleNum":53,"name":"三杯鸡+榄菜肉末四季豆套餐","new":false,"newPrice":22,"oldPrice":30},{"bargainPrice":true,"form":"三杯鸡+手撕杏鲍菇+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1021,"monthSaleNum":53,"name":"三杯鸡+手撕杏鲍菇套餐","new":false,"newPrice":22,"oldPrice":30},{"bargainPrice":true,"form":"三杯鸡+干锅千叶豆腐+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1022,"monthSaleNum":53,"name":"三杯鸡+干锅千叶豆腐套餐","new":false,"newPrice":22,"oldPrice":30}],"name":"三杯鸡双拼尊享套餐"},{"id":106,"info":"","list":[{"bargainPrice":true,"form":"干烧带鱼+肉末烧汁茄子+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1023,"monthSaleNum":53,"name":"干烧带鱼+肉末烧汁茄子套餐","new":false,"newPrice":22,"oldPrice":30},{"bargainPrice":true,"form":"干烧带鱼+榄菜肉末四季豆+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1024,"monthSaleNum":53,"name":"干烧带鱼+榄菜肉末四季豆套餐","new":false,"newPrice":22,"oldPrice":30},{"bargainPrice":true,"form":"干烧带鱼+手撕杏鲍菇+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1025,"monthSaleNum":53,"name":"干烧带鱼+手撕杏鲍菇套餐","new":false,"newPrice":22,"oldPrice":30},{"bargainPrice":true,"form":"干烧带鱼+干锅千叶豆腐+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1026,"monthSaleNum":53,"name":"干烧带鱼+干锅千叶豆腐套餐","new":false,"newPrice":22,"oldPrice":30}],"name":"带鱼双拼螓享套餐"},{"id":107,"info":"","list":[{"bargainPrice":true,"form":"红烧肉+肉末烧汁茄子+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1027,"monthSaleNum":53,"name":"红烧肉+肉末烧汁茄子套餐","new":false,"newPrice":22,"oldPrice":0},{"bargainPrice":true,"form":"红烧肉+榄菜肉末四季豆+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1028,"monthSaleNum":53,"name":"红烧肉+榄菜肉末四季豆套餐","new":false,"newPrice":22,"oldPrice":0},{"bargainPrice":true,"form":"红烧肉+手撕杏鲍菇+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1029,"monthSaleNum":53,"name":"红烧肉+手撕杏鲍菇套餐","new":false,"newPrice":22,"oldPrice":0},{"bargainPrice":true,"form":"红烧肉+干锅千叶豆腐+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1030,"monthSaleNum":53,"name":"红烧肉+干锅千叶豆腐套餐","new":false,"newPrice":22,"oldPrice":0}],"name":"双烧肉双拼智享套餐"},{"id":108,"info":"","list":[{"bargainPrice":true,"form":"土豆烧牛肉+肉末烧汁茄子+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1031,"monthSaleNum":53,"name":"土豆烧牛肉+肉末烧汁茄子套餐","new":false,"newPrice":25,"oldPrice":0},{"bargainPrice":true,"form":"土豆烧牛肉+榄菜肉末四季豆+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1032,"monthSaleNum":53,"name":"土豆烧牛肉+榄菜肉末四季豆套餐","new":false,"newPrice":25,"oldPrice":0},{"bargainPrice":true,"form":"土豆烧牛肉+手撕杏鲍菇+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1033,"monthSaleNum":53,"name":"土豆烧牛肉+手撕杏鲍菇套餐","new":false,"newPrice":25,"oldPrice":0},{"bargainPrice":true,"form":"土豆烧牛肉+干锅千叶豆腐+小食+时蔬)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1034,"monthSaleNum":53,"name":"土豆烧牛肉+干锅千叶豆腐套餐","new":false,"newPrice":25,"oldPrice":0}],"name":"牛肉双拼乐享套餐"},{"id":109,"info":"","list":[{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/sichuanpaocai.webp","id":1035,"monthSaleNum":53,"name":"四川泡菜","new":false,"newPrice":9,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/mizhiluobutiao.webp","id":1036,"monthSaleNum":53,"name":"秘制萝卜条","new":false,"newPrice":9,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/kaiweihuanggua.webp","id":1037,"monthSaleNum":53,"name":"开胃黄瓜","new":false,"newPrice":9,"oldPrice":0}],"name":"精品凉菜"},{"id":110,"info":"","list":[{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/huiyuan.webp","id":1038,"monthSaleNum":53,"name":"汇源果汁","new":false,"newPrice":3,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/mengniusuanniunai.webp","id":1035,"monthSaleNum":53,"name":"蒙牛酸牛奶","new":false,"newPrice":3,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/wanglaoji.webp","id":1036,"monthSaleNum":53,"name":"红罐王老吉","new":false,"newPrice":5,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/kekoukele.webp","id":1037,"monthSaleNum":53,"name":"可口可乐","new":false,"newPrice":5,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/maidong.webp","id":1038,"monthSaleNum":53,"name":"脉动","new":false,"newPrice":6,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/quechao.webp","id":1039,"monthSaleNum":53,"name":"雀巢丝滑拿铁","new":false,"newPrice":6,"oldPrice":0}],"name":"饮品"},{"id":111,"info":"","list":[{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping.webp","id":1040,"monthSaleNum":53,"name":"产品","new":false,"newPrice":0,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/jiagongzhongxin1.webp","id":1041,"monthSaleNum":53,"name":"加工中心1","new":false,"newPrice":0,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/jiagongzhongxin2.webp","id":1042,"monthSaleNum":53,"name":"加工中心2","new":false,"newPrice":0,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/jiagongzhongxin1.webp","id":1043,"monthSaleNum":53,"name":"加工中心3","new":false,"newPrice":0,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/jiagongzhongxin4.webp","id":1044,"monthSaleNum":53,"name":"加工中心4","new":false,"newPrice":0,"oldPrice":0},{"bargainPrice":true,"form":"","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/jiagongzhongxin5.webp","id":1045,"monthSaleNum":53,"name":"加工中心5","new":false,"newPrice":0,"oldPrice":0}],"name":"餐品加工中心及产品"}]
     */

    private String code;
    /**
     * id : 101
     * info : (不与其它活动同享)13.9元特价套餐!!|13.9特价套餐!!(每单仅限2份)
     * list : [{"bargainPrice":true,"form":"肉末烧汁茄子+千叶豆腐+小食+时蔬+含粗粮米饭)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp","id":1001,"monthSaleNum":53,"name":"肉末烧汁茄子+千叶豆腐套餐(含粗粮米饭)","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"肉末烧汁茄子+榄菜肉末四季豆+小食+时蔬+含粗粮米饭)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp","id":1002,"monthSaleNum":37,"name":"肉末烧汁茄子+四季豆套餐(含粗粮米饭)","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"手撕杏鲍菇+千叶豆腐+小食+时蔬+含粗粮米饭)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp","id":1003,"monthSaleNum":27,"name":"手撕杏鲍菇+千叶豆腐套餐(含粗粮米饭)","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"肉末烧汁茄子+杏鲍菇+小食+时蔬+含粗粮米饭)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp","id":1004,"monthSaleNum":24,"name":"肉末烧汁茄子+杏鲍菇套餐(含粗粮米饭)","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"榄菜肉末四季豆+千叶豆腐+小食+时蔬+含粗粮米饭)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp","id":1005,"monthSaleNum":53,"name":"榄菜肉末四季豆+千叶豆腐套餐(含粗粮米饭)","new":false,"newPrice":13.899999618530273,"oldPrice":30},{"bargainPrice":true,"form":"榄菜肉末四季豆+手撕杏鲍菇+小食+时蔬+含粗粮米饭)","icon":"http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp","id":1006,"monthSaleNum":53,"name":"榄菜肉末四季豆+手撕杏鲍菇套餐(含粗粮米饭)","new":false,"newPrice":13.899999618530273,"oldPrice":30}]
     * name : 13.9特价套餐
     */

    private List<DataBean> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private int id;
        private String info;
        private String name;
        /**
         * bargainPrice : true
         * form : 肉末烧汁茄子+千叶豆腐+小食+时蔬+含粗粮米饭)
         * icon : http://172.16.0.116:8080/TakeoutService/imgs/goods/caiping_taocan.webp
         * id : 1001
         * monthSaleNum : 53
         * name : 肉末烧汁茄子+千叶豆腐套餐(含粗粮米饭)
         * new : false
         * newPrice : 13.899999618530273
         * oldPrice : 30
         */

        private List<ListBean> list;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private boolean bargainPrice;
            private String form;
            private String icon;
            private int id;
            private int monthSaleNum;
            private String name;
            @SerializedName("new")
            private boolean newX;
            private double newPrice;
            private int oldPrice;

            public boolean isBargainPrice() {
                return bargainPrice;
            }

            public void setBargainPrice(boolean bargainPrice) {
                this.bargainPrice = bargainPrice;
            }

            public String getForm() {
                return form;
            }

            public void setForm(String form) {
                this.form = form;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getMonthSaleNum() {
                return monthSaleNum;
            }

            public void setMonthSaleNum(int monthSaleNum) {
                this.monthSaleNum = monthSaleNum;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isNewX() {
                return newX;
            }

            public void setNewX(boolean newX) {
                this.newX = newX;
            }

            public double getNewPrice() {
                return newPrice;
            }

            public void setNewPrice(double newPrice) {
                this.newPrice = newPrice;
            }

            public int getOldPrice() {
                return oldPrice;
            }

            public void setOldPrice(int oldPrice) {
                this.oldPrice = oldPrice;
            }
        }
    }
}
