package com.example.yls.news.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yls on 2017/5/16.
 */

public class NewsBean {


    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"4fd3b589bcd5f817931ce37ff0783a1b","title":"印度10岁女孩遭继父强奸怀孕5个月 法院准许堕胎","date":"2017-05-17 09:36","category":"头条","author_name":"封面新闻-华西都市报","url":"http://mini.eastday.com/mobile/170517093648022.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170517/20170517093648_8ced1c09c4ef4be33cc97e40053cd9f7_2_mwpm_03200403.png","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170517/20170517093648_8ced1c09c4ef4be33cc97e40053cd9f7_1_mwpm_03200403.png","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170517/20170517093648_8ced1c09c4ef4be33cc97e40053cd9f7_4_mwpm_03200403.png"},{"uniquekey":"91850a9056344ff95131c6e0d49867df","title":"安永研究表明：中国已成可再生能源领域投资最具吸引力国家","date":"2017-05-17 10:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517104419582.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170517/20170517104419_aee1e6b5133f939a996b56c1e2c069aa_1_mwpm_03200403.jpeg"},{"uniquekey":"94fa3c4012b93ca8945587b3f9e8fc34","title":"美国家安全局被曝曾担忧\u201c永恒之蓝\u201d泄露欲通知微软","date":"2017-05-17 10:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517104419143.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170517/20170517104419_91d216b858c85082f38886486b06db91_1_mwpm_03200403.jpeg"},{"uniquekey":"907b63d928b5a8c4e05d984b5c5d1b17","title":"日本真子公主订婚 创设\u201c女性宫家\u201d 皇室改革引关注","date":"2017-05-17 10:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517104416347.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170517/20170517104416_14292fe27d3ab893591ba9dc0d8e6c30_1_mwpm_03200403.jpeg"},{"uniquekey":"b48375a2d8046409d5147bb127045a51","title":"英工党发表竞选宣言 欲向富人增加征税","date":"2017-05-17 10:29","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517102940811.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170517/20170517102940_0f88345e9dfa788e1fe471b3ae793812_1_mwpm_03200403.jpeg"},{"uniquekey":"7af127ca74ce4d0490bee8576e968cd9","title":"俄伏尔加格勒一公寓楼天然气爆炸 致3死11伤","date":"2017-05-17 10:26","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517102621948.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170517/20170517102621_ec6fdafda01c1862862c5dffde2bc985_1_mwpm_03200403.jpeg"},{"uniquekey":"f068ff747d2114af6331bdc7ea13d660","title":"儿童失踪信息平台\"团圆\"上线一年:以快制快 织密儿童保护体系","date":"2017-05-17 10:16","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170517101636257.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170517/20170517101636_d95f6950655dddf5ee798b30ad1e43ec_1_mwpm_03200403.png"},{"uniquekey":"8d015d9a5893020d077ef94e2b347e15","title":"韩民众总统府前示威 称政府应明确要求美国终止\u201c萨德\u201d部署","date":"2017-05-17 09:48","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517094842464.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170517/20170517094842_b6063c42be5ec2035308b26e070aabab_1_mwpm_03200403.jpeg"},{"uniquekey":"adbefa7b94f50e14db79b5bb2dc5c0bc","title":"强奸两名中国女留学生难民认罪 德国法律判其11年刑期","date":"2017-05-17 09:48","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517094810994.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170517/20170517094810_d0cf22785011b1d3f36261ea568e5315_1_mwpm_03200403.jpeg"},{"uniquekey":"4efcaee04231c1150f98f12556a25a86","title":"一枝一叶总关情\u2014\u2014最高检四位干部挂职云南扶贫纪实","date":"2017-05-17 09:45","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170517094532053.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170517/20170517094532_54d66f8debae05ddaa25fdbf01781c4e_1_mwpm_03200403.jpeg"},{"uniquekey":"7f87f02c628b29748d4dd90d3c2638df","title":"京东高管点赞百雀羚营销 揭秘国产老字号何以返老还童","date":"2017-05-17 09:23","category":"头条","author_name":"中国经济网","url":"http://mini.eastday.com/mobile/170517092357265.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170517/20170517092357_c7f8984c89b4f66de4960e426fbe736b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170517/20170517092357_c7f8984c89b4f66de4960e426fbe736b_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170517/20170517092357_c7f8984c89b4f66de4960e426fbe736b_3_mwpm_03200403.jpeg"},{"uniquekey":"48fd42e92e06d814aa12fe6a5efa7d87","title":"这五大生肖什么都好，就是脾气大","date":"2017-05-17 09:19","category":"头条","author_name":"撼龙","url":"http://mini.eastday.com/mobile/170517091907322.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170517/20170517091907_1f5c5d2ccda4845e417cdade7982746a_2_mwpm_03200403.png","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170517/20170517091907_1f5c5d2ccda4845e417cdade7982746a_5_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170517/20170517091907_1f5c5d2ccda4845e417cdade7982746a_3_mwpm_03200403.jpeg"},{"uniquekey":"51f93b9e448db1009aa993b8fc4bfce0","title":"陕西新任省委常委杜航伟兼任省委政法委书记","date":"2017-05-17 09:16","category":"头条","author_name":"西部网","url":"http://mini.eastday.com/mobile/170517091641854.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170517/20170517091641_d0689a4cdd8a10a660989e511dc07e7b_1_mwpm_03200403.jpeg"},{"uniquekey":"bdd1206ec922b4f63b6b06a591adfb90","title":"《夏天19岁的肖像》曝黄子韬\u201c守护青春\u201d预告片","date":"2017-05-17 09:14","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170517091454795.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170517/20170517091454_e42074ca5894fc29827631bac3fc4c59_1_mwpm_03200403.jpeg"},{"uniquekey":"07406782e81009a4718584bb21690550","title":"妻子待产男子欲迷奸女性朋友 \"贴心\"关怀竟是狼的色心","date":"2017-05-17 09:14","category":"头条","author_name":"钱江晚报","url":"http://mini.eastday.com/mobile/170517091426139.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170517/20170517091426_3055742acce24f363d982338aa2f62a3_1_mwpm_03200403.jpeg"},{"uniquekey":"a5c28f6cc74abf1a09076053e3ddb80b","title":"走进武当山女道姑修行的生活：爱玩微信，从未谈过恋爱","date":"2017-05-17 09:13","category":"头条","author_name":"图看世界","url":"http://mini.eastday.com/mobile/170517091302925.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170517/20170517_e1e3421d090dd1a55e5a3fa30cd84c40_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170517/20170517_e7c484ccb1ea6a63ab6374711b294dd6_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170517/20170517_fc73481c02d8f8d230fca1f6ac0e36a2_cover_mwpm_03200403.jpeg"},{"uniquekey":"78066b500e9672f3b4ba38e9dc6ba184","title":"广州公交一男子竟做出这种事，女子身材好穿丝袜被一路非礼","date":"2017-05-17 09:00","category":"头条","author_name":"乡土农村","url":"http://mini.eastday.com/mobile/170517090033038.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170517/20170516_d7a04872d5c305c63937b2221d8b1a0a_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170517/20170516_6257737dfb38911103213265acd8f1a7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170517/20170516_1c1ded0af1f9d9b28a5b1b27ae8047ed_mwpm_03200403.jpg"},{"uniquekey":"b3f9e511cb3bf5cb36559d0c7d245655","title":"被指控是痴汉 日男子大喊\u201c不是我\u201d跳轨逃跑遭电车撞死","date":"2017-05-17 08:58","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517085828135.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170517/20170517085828_3f371e2d7ae628bdbca2deb876496b05_1_mwpm_03200403.jpeg"},{"uniquekey":"e93058073a55504c697202f5fee9df56","title":"孙俪曾罢演，邓超在片场不留面子：耍大牌都耍到这里来了！","date":"2017-05-17 08:56","category":"头条","author_name":"娱公主","url":"http://mini.eastday.com/mobile/170517085606981.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170517/20170517_ec8b4227a5314bf77f399665b33d5498_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170517/20170517_9f9f8ccbf85b0349e3457234c037b33a_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170517/20170517_51c1950ac50b894af4e463d4f5526ef7_cover_mwpm_03200403.jpeg"},{"uniquekey":"e762732b16de04df50e4781e5ed5c25b","title":"访韩美白宫高官：同韩外交部官员会晤十分愉快","date":"2017-05-17 08:46","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517084640861.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170517/20170517084640_2548f0041a29ae24c0d7592fd710c844_1_mwpm_03200403.jpeg"},{"uniquekey":"142d0eba2f5fab44797640dbbc33068a","title":"百年修得陈赫，千年修得黄宗泽！娱乐圈最好的现任、前任！","date":"2017-05-17 08:46","category":"头条","author_name":"明星那些事","url":"http://mini.eastday.com/mobile/170517084625669.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170517/20170517_cea23db3033b229e58a45e0efd85e0cc_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170517/20170517_d7e22699e409ee423e63c551879fdb95_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170517/20170517_f499b2312cb4d42ca84f15d1475504b4_cover_mwpm_03200403.jpeg"},{"uniquekey":"6e9c52de857d2322f130245853a39cd3","title":"日媒：因中美接近 安倍政府担忧被搁置积极转变态度","date":"2017-05-17 08:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517084449220.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170517/20170517084449_f03b17ac571680012b3a1ff9c354343b_1_mwpm_03200403.jpeg"},{"uniquekey":"8282e5e7d5af63c36fdba616380aca45","title":"这两国要造抗衡中国的\u201c战略长城\u201d 现实却\u2026\u2026","date":"2017-05-17 08:42","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170517084208562.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170517/20170517084208_32e6eaeaeb9f30a74216627133727f96_1_mwpm_03200403.jpeg"},{"uniquekey":"19537a80ed5332f3ab9b6df35821c22a","title":"震惊！江面上现女子遗体 围观群众中一女竟当场跳江","date":"2017-05-17 08:35","category":"头条","author_name":"偷得浮生82","url":"http://mini.eastday.com/mobile/170517083512975.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170517/20170517_4c8e3d150f9cc437f96a4fa9688ad213_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170517/20170517_b67d4c9f42b95490341b8dedb857a475_cover_mwpm_03200403.png"},{"uniquekey":"bdf05de60973a47967fc341768b11e34","title":"大深圳又得全国第一！这次的排名，北上广都服了！","date":"2017-05-17 08:32","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170517083212811.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170517/20170517083212_95b41edaf3a8b002cfe78cc1156ef752_9_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170517/20170517083212_95b41edaf3a8b002cfe78cc1156ef752_8_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170517/20170517083212_95b41edaf3a8b002cfe78cc1156ef752_10_mwpm_03200403.jpeg"},{"uniquekey":"ec36ae747ee5a5a6b9ac573edf8f0bfa","title":"三哥，江湖变了，再不醒醒就睡过去了～","date":"2017-05-17 08:31","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517083100800.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170517/20170517083100_6b4fcfae683e6e3079e806969a567d3c_6_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170517/20170517083100_6b4fcfae683e6e3079e806969a567d3c_5_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170517/20170517083100_6b4fcfae683e6e3079e806969a567d3c_7_mwpm_03200403.jpeg"},{"uniquekey":"214818a5657ced5784eebd603ed22709","title":"张艺谋：《对话·寓言2047》灵感来源于孩子","date":"2017-05-17 08:29","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170517082943902.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170517/20170517082943_66b823477b68d86f4a3d52a2f1000eb1_1_mwpm_03200403.jpeg"},{"uniquekey":"cfc3e0fd49abc742d48edcb1fa2ebf28","title":"新媒：中美关系趋向回暖 日本在亚太郁郁寡欢","date":"2017-05-17 08:29","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170517082931827.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170517/20170517082931_ec78b273b0ed74a0b0439dd0c3779825_1_mwpm_03200403.jpeg"},{"uniquekey":"cfefbcef0059596cacb9837e5b4a3d53","title":"澳媒：全球领导权的衣钵已从美国传到中国？","date":"2017-05-17 08:29","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170517082918825.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170517/20170517082918_5be95e911abf015e32c04e1af0565a88_1_mwpm_03200403.jpeg"},{"uniquekey":"7b221cb9995aba676ac0f02d7406c350","title":"绿媒妄称大陆想统一是图台湾的钱 遭批幻想会将台带向毀灭","date":"2017-05-17 08:26","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170517082655988.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170517/20170517082655_d24be1038fc1fbe2696eb45744699d52_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170517/20170517082655_ba3c0022ad7b7c88b07d4da951266356_1_mwpm_03200403.jpeg"}]}
     * error_code : 0
     */

    private String reason;
    /**
     * stat : 1
     * data : [{"uniquekey":"4fd3b589bcd5f817931ce37ff0783a1b","title":"印度10岁女孩遭继父强奸怀孕5个月 法院准许堕胎","date":"2017-05-17 09:36","category":"头条","author_name":"封面新闻-华西都市报","url":"http://mini.eastday.com/mobile/170517093648022.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170517/20170517093648_8ced1c09c4ef4be33cc97e40053cd9f7_2_mwpm_03200403.png","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170517/20170517093648_8ced1c09c4ef4be33cc97e40053cd9f7_1_mwpm_03200403.png","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170517/20170517093648_8ced1c09c4ef4be33cc97e40053cd9f7_4_mwpm_03200403.png"},{"uniquekey":"91850a9056344ff95131c6e0d49867df","title":"安永研究表明：中国已成可再生能源领域投资最具吸引力国家","date":"2017-05-17 10:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517104419582.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170517/20170517104419_aee1e6b5133f939a996b56c1e2c069aa_1_mwpm_03200403.jpeg"},{"uniquekey":"94fa3c4012b93ca8945587b3f9e8fc34","title":"美国家安全局被曝曾担忧\u201c永恒之蓝\u201d泄露欲通知微软","date":"2017-05-17 10:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517104419143.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170517/20170517104419_91d216b858c85082f38886486b06db91_1_mwpm_03200403.jpeg"},{"uniquekey":"907b63d928b5a8c4e05d984b5c5d1b17","title":"日本真子公主订婚 创设\u201c女性宫家\u201d 皇室改革引关注","date":"2017-05-17 10:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517104416347.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170517/20170517104416_14292fe27d3ab893591ba9dc0d8e6c30_1_mwpm_03200403.jpeg"},{"uniquekey":"b48375a2d8046409d5147bb127045a51","title":"英工党发表竞选宣言 欲向富人增加征税","date":"2017-05-17 10:29","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517102940811.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170517/20170517102940_0f88345e9dfa788e1fe471b3ae793812_1_mwpm_03200403.jpeg"},{"uniquekey":"7af127ca74ce4d0490bee8576e968cd9","title":"俄伏尔加格勒一公寓楼天然气爆炸 致3死11伤","date":"2017-05-17 10:26","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517102621948.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170517/20170517102621_ec6fdafda01c1862862c5dffde2bc985_1_mwpm_03200403.jpeg"},{"uniquekey":"f068ff747d2114af6331bdc7ea13d660","title":"儿童失踪信息平台\"团圆\"上线一年:以快制快 织密儿童保护体系","date":"2017-05-17 10:16","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170517101636257.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170517/20170517101636_d95f6950655dddf5ee798b30ad1e43ec_1_mwpm_03200403.png"},{"uniquekey":"8d015d9a5893020d077ef94e2b347e15","title":"韩民众总统府前示威 称政府应明确要求美国终止\u201c萨德\u201d部署","date":"2017-05-17 09:48","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517094842464.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170517/20170517094842_b6063c42be5ec2035308b26e070aabab_1_mwpm_03200403.jpeg"},{"uniquekey":"adbefa7b94f50e14db79b5bb2dc5c0bc","title":"强奸两名中国女留学生难民认罪 德国法律判其11年刑期","date":"2017-05-17 09:48","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517094810994.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170517/20170517094810_d0cf22785011b1d3f36261ea568e5315_1_mwpm_03200403.jpeg"},{"uniquekey":"4efcaee04231c1150f98f12556a25a86","title":"一枝一叶总关情\u2014\u2014最高检四位干部挂职云南扶贫纪实","date":"2017-05-17 09:45","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170517094532053.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170517/20170517094532_54d66f8debae05ddaa25fdbf01781c4e_1_mwpm_03200403.jpeg"},{"uniquekey":"7f87f02c628b29748d4dd90d3c2638df","title":"京东高管点赞百雀羚营销 揭秘国产老字号何以返老还童","date":"2017-05-17 09:23","category":"头条","author_name":"中国经济网","url":"http://mini.eastday.com/mobile/170517092357265.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170517/20170517092357_c7f8984c89b4f66de4960e426fbe736b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170517/20170517092357_c7f8984c89b4f66de4960e426fbe736b_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170517/20170517092357_c7f8984c89b4f66de4960e426fbe736b_3_mwpm_03200403.jpeg"},{"uniquekey":"48fd42e92e06d814aa12fe6a5efa7d87","title":"这五大生肖什么都好，就是脾气大","date":"2017-05-17 09:19","category":"头条","author_name":"撼龙","url":"http://mini.eastday.com/mobile/170517091907322.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170517/20170517091907_1f5c5d2ccda4845e417cdade7982746a_2_mwpm_03200403.png","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170517/20170517091907_1f5c5d2ccda4845e417cdade7982746a_5_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170517/20170517091907_1f5c5d2ccda4845e417cdade7982746a_3_mwpm_03200403.jpeg"},{"uniquekey":"51f93b9e448db1009aa993b8fc4bfce0","title":"陕西新任省委常委杜航伟兼任省委政法委书记","date":"2017-05-17 09:16","category":"头条","author_name":"西部网","url":"http://mini.eastday.com/mobile/170517091641854.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170517/20170517091641_d0689a4cdd8a10a660989e511dc07e7b_1_mwpm_03200403.jpeg"},{"uniquekey":"bdd1206ec922b4f63b6b06a591adfb90","title":"《夏天19岁的肖像》曝黄子韬\u201c守护青春\u201d预告片","date":"2017-05-17 09:14","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170517091454795.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170517/20170517091454_e42074ca5894fc29827631bac3fc4c59_1_mwpm_03200403.jpeg"},{"uniquekey":"07406782e81009a4718584bb21690550","title":"妻子待产男子欲迷奸女性朋友 \"贴心\"关怀竟是狼的色心","date":"2017-05-17 09:14","category":"头条","author_name":"钱江晚报","url":"http://mini.eastday.com/mobile/170517091426139.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170517/20170517091426_3055742acce24f363d982338aa2f62a3_1_mwpm_03200403.jpeg"},{"uniquekey":"a5c28f6cc74abf1a09076053e3ddb80b","title":"走进武当山女道姑修行的生活：爱玩微信，从未谈过恋爱","date":"2017-05-17 09:13","category":"头条","author_name":"图看世界","url":"http://mini.eastday.com/mobile/170517091302925.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170517/20170517_e1e3421d090dd1a55e5a3fa30cd84c40_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170517/20170517_e7c484ccb1ea6a63ab6374711b294dd6_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170517/20170517_fc73481c02d8f8d230fca1f6ac0e36a2_cover_mwpm_03200403.jpeg"},{"uniquekey":"78066b500e9672f3b4ba38e9dc6ba184","title":"广州公交一男子竟做出这种事，女子身材好穿丝袜被一路非礼","date":"2017-05-17 09:00","category":"头条","author_name":"乡土农村","url":"http://mini.eastday.com/mobile/170517090033038.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170517/20170516_d7a04872d5c305c63937b2221d8b1a0a_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170517/20170516_6257737dfb38911103213265acd8f1a7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170517/20170516_1c1ded0af1f9d9b28a5b1b27ae8047ed_mwpm_03200403.jpg"},{"uniquekey":"b3f9e511cb3bf5cb36559d0c7d245655","title":"被指控是痴汉 日男子大喊\u201c不是我\u201d跳轨逃跑遭电车撞死","date":"2017-05-17 08:58","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517085828135.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170517/20170517085828_3f371e2d7ae628bdbca2deb876496b05_1_mwpm_03200403.jpeg"},{"uniquekey":"e93058073a55504c697202f5fee9df56","title":"孙俪曾罢演，邓超在片场不留面子：耍大牌都耍到这里来了！","date":"2017-05-17 08:56","category":"头条","author_name":"娱公主","url":"http://mini.eastday.com/mobile/170517085606981.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170517/20170517_ec8b4227a5314bf77f399665b33d5498_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170517/20170517_9f9f8ccbf85b0349e3457234c037b33a_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170517/20170517_51c1950ac50b894af4e463d4f5526ef7_cover_mwpm_03200403.jpeg"},{"uniquekey":"e762732b16de04df50e4781e5ed5c25b","title":"访韩美白宫高官：同韩外交部官员会晤十分愉快","date":"2017-05-17 08:46","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517084640861.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170517/20170517084640_2548f0041a29ae24c0d7592fd710c844_1_mwpm_03200403.jpeg"},{"uniquekey":"142d0eba2f5fab44797640dbbc33068a","title":"百年修得陈赫，千年修得黄宗泽！娱乐圈最好的现任、前任！","date":"2017-05-17 08:46","category":"头条","author_name":"明星那些事","url":"http://mini.eastday.com/mobile/170517084625669.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170517/20170517_cea23db3033b229e58a45e0efd85e0cc_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170517/20170517_d7e22699e409ee423e63c551879fdb95_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170517/20170517_f499b2312cb4d42ca84f15d1475504b4_cover_mwpm_03200403.jpeg"},{"uniquekey":"6e9c52de857d2322f130245853a39cd3","title":"日媒：因中美接近 安倍政府担忧被搁置积极转变态度","date":"2017-05-17 08:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517084449220.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170517/20170517084449_f03b17ac571680012b3a1ff9c354343b_1_mwpm_03200403.jpeg"},{"uniquekey":"8282e5e7d5af63c36fdba616380aca45","title":"这两国要造抗衡中国的\u201c战略长城\u201d 现实却\u2026\u2026","date":"2017-05-17 08:42","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170517084208562.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170517/20170517084208_32e6eaeaeb9f30a74216627133727f96_1_mwpm_03200403.jpeg"},{"uniquekey":"19537a80ed5332f3ab9b6df35821c22a","title":"震惊！江面上现女子遗体 围观群众中一女竟当场跳江","date":"2017-05-17 08:35","category":"头条","author_name":"偷得浮生82","url":"http://mini.eastday.com/mobile/170517083512975.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170517/20170517_4c8e3d150f9cc437f96a4fa9688ad213_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170517/20170517_b67d4c9f42b95490341b8dedb857a475_cover_mwpm_03200403.png"},{"uniquekey":"bdf05de60973a47967fc341768b11e34","title":"大深圳又得全国第一！这次的排名，北上广都服了！","date":"2017-05-17 08:32","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170517083212811.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170517/20170517083212_95b41edaf3a8b002cfe78cc1156ef752_9_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170517/20170517083212_95b41edaf3a8b002cfe78cc1156ef752_8_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170517/20170517083212_95b41edaf3a8b002cfe78cc1156ef752_10_mwpm_03200403.jpeg"},{"uniquekey":"ec36ae747ee5a5a6b9ac573edf8f0bfa","title":"三哥，江湖变了，再不醒醒就睡过去了～","date":"2017-05-17 08:31","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170517083100800.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170517/20170517083100_6b4fcfae683e6e3079e806969a567d3c_6_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170517/20170517083100_6b4fcfae683e6e3079e806969a567d3c_5_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170517/20170517083100_6b4fcfae683e6e3079e806969a567d3c_7_mwpm_03200403.jpeg"},{"uniquekey":"214818a5657ced5784eebd603ed22709","title":"张艺谋：《对话·寓言2047》灵感来源于孩子","date":"2017-05-17 08:29","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170517082943902.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170517/20170517082943_66b823477b68d86f4a3d52a2f1000eb1_1_mwpm_03200403.jpeg"},{"uniquekey":"cfc3e0fd49abc742d48edcb1fa2ebf28","title":"新媒：中美关系趋向回暖 日本在亚太郁郁寡欢","date":"2017-05-17 08:29","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170517082931827.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170517/20170517082931_ec78b273b0ed74a0b0439dd0c3779825_1_mwpm_03200403.jpeg"},{"uniquekey":"cfefbcef0059596cacb9837e5b4a3d53","title":"澳媒：全球领导权的衣钵已从美国传到中国？","date":"2017-05-17 08:29","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170517082918825.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170517/20170517082918_5be95e911abf015e32c04e1af0565a88_1_mwpm_03200403.jpeg"},{"uniquekey":"7b221cb9995aba676ac0f02d7406c350","title":"绿媒妄称大陆想统一是图台湾的钱 遭批幻想会将台带向毀灭","date":"2017-05-17 08:26","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170517082655988.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170517/20170517082655_d24be1038fc1fbe2696eb45744699d52_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170517/20170517082655_ba3c0022ad7b7c88b07d4da951266356_1_mwpm_03200403.jpeg"}]
     */

    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        private String stat;
        /**
         * uniquekey : 4fd3b589bcd5f817931ce37ff0783a1b
         * title : 印度10岁女孩遭继父强奸怀孕5个月 法院准许堕胎
         * date : 2017-05-17 09:36
         * category : 头条
         * author_name : 封面新闻-华西都市报
         * url : http://mini.eastday.com/mobile/170517093648022.html
         * thumbnail_pic_s : http://02.imgmini.eastday.com/mobile/20170517/20170517093648_8ced1c09c4ef4be33cc97e40053cd9f7_2_mwpm_03200403.png
         * thumbnail_pic_s02 : http://02.imgmini.eastday.com/mobile/20170517/20170517093648_8ced1c09c4ef4be33cc97e40053cd9f7_1_mwpm_03200403.png
         * thumbnail_pic_s03 : http://02.imgmini.eastday.com/mobile/20170517/20170517093648_8ced1c09c4ef4be33cc97e40053cd9f7_4_mwpm_03200403.png
         */

        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean{
            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
