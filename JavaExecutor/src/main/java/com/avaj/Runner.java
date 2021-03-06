package com.avaj;

public class Runner {
    private static final String DOWNLOAD_URL = "https://raw.githubusercontent.com/REBOOTERS/SomeFile/master/App.pdf";

    public static void main(String[] args) {
//        System.err.println("File Download ----->");
//        new HttpDownload(DOWNLOAD_URL).start();

//        FileCopy.copy("README.md", "README1.md");

//        System.err.println("read content of ch_file.txt ------> " + ReadContent.read("HttpDemo\\src\\main\\java\\home\\smart\\fly\\httpurlconnectiondemo\\RxJavaDemoActivity.java"));

        String content = "<div data-note-content=\"\" class=\"show-content\"> \n" +
                " <div class=\"image-package\"> \n" +
                "  <img src=\"http://upload-images.jianshu.io/upload_images/1115031-cd84121ead151fe6.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240\" data-original-src=\"http://upload-images.jianshu.io/upload_images/1115031-cd84121ead151fe6.jpg?imageMogr2/auto-orient/strip%7CimageView2/2\" style=\"max-width:100%;height:auto;\" />\n" +
                "  <br />\n" +
                "  <div class=\"image-caption\"></div> \n" +
                " </div> \n" +
                " <h2>我为什么还在玩朋友圈</h2> \n" +
                " <p>你为什么还在玩朋友圈？第一次看到这个问题是在知乎上面。其实每次在知乎上看各种问题，都是奔着神回复而去，很少认真的去思考一个问题；这个问题是个例外。</p> \n" +
                " <p>拿出手机翻了一下，自己的第一条朋友圈是在2012年的夏天发的；那个时候，大学毕业刚步入社会，感觉外面的世界很精彩，每次发现新奇好玩的东西，都会拍张照发个朋友圈。在那个年代，世界上应该是有两种人，一种是整天用微信摇一摇约X的人，还有一种是鄙视第一类人而拒绝使用微信的人，所以那会儿的朋友圈里没有广告，软文，有的只是每个人对生活纯粹的记录；由于玩的人少，几乎一两天才能看到一条新的朋友圈。看见觉得有意思的内容，还会点个赞或评论几句；感觉在人人网和QQ空间之外又开辟了一片新天地。</p> \n" +
                " <p>后来，随着规模的普及，朋友圈里的内容不再似从前那么简单，开始出现大量的微商广告，心灵鸡汤，里面充斥着不转不是中国人、杨澜给女性的20个忠告、第五秒我就流泪了、100万人在疯转……</p> \n" +
                " <p>很多人在这个时候选择了关闭朋友圈，觉得各类垃圾信息扰乱了正常的生活，每天花费大量时间刷朋友圈有点浪费时间。也有一些人，选择了折中的方案，在朋友圈屏蔽了那些在朋友圈发无价值内容人的朋友圈，甚至包括自己的父母。</p> \n" +
                " <div class=\"image-package\"> \n" +
                "  <img src=\"http://upload-images.jianshu.io/upload_images/1115031-62c59b9f3ad281fe.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240\" data-original-src=\"http://upload-images.jianshu.io/upload_images/1115031-62c59b9f3ad281fe.jpg?imageMogr2/auto-orient/strip%7CimageView2/2\" style=\"max-width:100%;height:auto;\" />\n" +
                "  <br />\n" +
                "  <div class=\"image-caption\"></div> \n" +
                " </div> \n" +
                " <p>时至今日，我依旧每天不知疲倦的刷着朋友圈，早晨睁开眼的第一件事是看一眼朋友圈，睡觉前的最后一件事还是看一眼朋友圈；也许这是一种病，但我更愿意承认这是一种习惯。</p> \n" +
                " <p>曾经不止一次的问过自己为什么还这么热衷于朋友圈，我似乎是那种从来都不善于使用聊天软件和朋友们联络彼此的人，因此在我的朋友圈里很少会和朋友们互动。因此，和许多人一样，我们的朋友圈里装的并不是朋友；而是一些注定在我们的生命里匆匆而过的人，或者说是曾经的朋友们。在这个信息爆炸的时代里，每天有大量的信息充斥在我们的手机里；而我们却需要在每一天那工作之外的空余时间里筛选出对自己最有价值的信息；很多人说现在的年轻人迷恋于手机；吃饭，走路，坐车甚至上厕所都在玩手机，其实不是的呀，手机已经成为了我们生活的一部分，已然成为我们这一代人学习，娱乐，沟通甚至是工作的重要工具。我们不想也不能错过一些重要的信息；我们不想错过科比退役前的最后一场比赛，我们想时刻都知道他在最后一场比赛得了多少分；我们想第一时间知道里约奥运会中国队得了多少块金牌；我们想知道在遥远的法兰西大球场，葡萄牙和法国谁最终夺得了冠军，特朗普和希拉里谁会是下一任的美国总统……，而手机是帮我们实现这些想法最方便的工具。</p> \n" +
                " <p>以前有句话，说是总会有一些人出现在我们的生命中，教会我们一些道理，给我们上上一课，然后转身离去。记得上大学那会儿看《那些年，我们一起追过的女孩》，电影最后沈佳宜结婚了，然后故事也就结束了；因此我们总觉得在一段刻骨铭心的爱情故事中，随着主人公步入婚姻的殿堂，所有的角色都会释然，所有的暧昧与懵懂都将幻化成为回忆。</p> \n" +
                " <div class=\"image-package\"> \n" +
                "  <img src=\"http://upload-images.jianshu.io/upload_images/1115031-ac5426d8ac1c8dd4.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240\" data-original-src=\"http://upload-images.jianshu.io/upload_images/1115031-ac5426d8ac1c8dd4.jpg?imageMogr2/auto-orient/strip%7CimageView2/2\" style=\"max-width:100%;height:auto;\" />\n" +
                "  <br />\n" +
                "  <div class=\"image-caption\"></div> \n" +
                " </div> \n" +
                " <p><strong>三年二班当年那些不能说的秘密，开不了口的话，随着时间的轨迹都安静的搁浅在了珊瑚海。雨后的晴天总会出现彩虹，就像那个曾经和我一起在屋顶听发如雪的姑娘，总会有甜甜的笑容。人生有时候特别像一场最长的电影，纵然我们踏过千山万水，来到千里之外，却依旧想乘着时光机回到过去。</strong></p> \n" +
                " <p>然而，生活不是拍电影，更不是写小说，世间也没有感同身受这回事儿。我们依旧会在会在朋友圈里关注着那个曾经让我们成长的人，怀念曾经的暧昧的时光；哪怕所有的故事早已尘埃落定，曾经的那个人早已为人父母，我们却依旧刷着朋友圈，不想错过关于那个人的点点滴滴，以一种近乎变态的方式存在着。我们想过和过去告别，却总以失败告终。记得《奇葩说》里有一期，大家都在说如果需要一个仪式和过去彻底的告别，那就是去参加前任的婚礼，因为在那场仪式里我们才会真正的放下过去；到最后高晓松说，如果一定需要一个这样的仪式的话，那应该是我们自己的，而不是别人的。那一刻，我忽然想到，也许在电影里真正释怀的人，也就只有沈佳宜吧！</p> \n" +
                " <h2>喜欢就会评论，但爱就是点赞</h2> \n" +
                " <p>在朋友圈里有这样一个人，她似乎特别喜欢云游四海，她去过许多地方，甚至是有些人一辈子都不会去的地方，比如漠河；她每去一个地方，都会发在朋友圈里发一些照片，有段日子里她应该是接连去了好多地方，从鄂尔多斯到林芝，再到吐鲁番盆地，看着那些好看的照片甚至让我有了世界那么大，我想去看看的冲动。后来又一想总觉得这是件有意思却没意义的事情，那些在路过的车站，偶遇的路人，未曾见过的风景人情都会随着时间逐渐被遗忘，而我们终归要回到朝九晚五，柴米油盐的生活当中。中秋节的时候，和同学出去玩了一趟，玩的兴起也拍了一些好玩的照片发到了朋友圈；回想一下过往的这一年，感觉这次出去玩是印象最深刻的时光之一。那些加班加点早出晚归的日常生活，却成了最模糊的回忆。所以，其实我们所经历的每一件事都是有意义的。</p> \n" +
                " <div class=\"image-package\"> \n" +
                "  <img src=\"http://upload-images.jianshu.io/upload_images/1115031-6ea14e04efecbdf1.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240\" data-original-src=\"http://upload-images.jianshu.io/upload_images/1115031-6ea14e04efecbdf1.jpg?imageMogr2/auto-orient/strip%7CimageView2/2\" style=\"max-width:100%;height:auto;\" />\n" +
                "  <br />\n" +
                "  <div class=\"image-caption\"></div> \n" +
                " </div> \n" +
                " <p>记得玩朋友圈最火热的那段时间，最喜欢做的事情就是点赞，俨然一副点赞狂魔的姿态；认识的不认识的人，发个朋友圈都会去点赞；如果说朋友圈里彼此的关系可以用一个数字量化的话，那么总觉得点一次赞会在这个数字上加一，时间长了点赞多了，好朋友的友谊会更加的天长地久，而那些不知道怎么加为好友的人，则会慢慢融入到一起，变成朋友，因为这毕竟是朋友圈呀。这种错觉一直弥漫了很久，直到有一天你发现你给别人点赞的次数大于别人给你点赞的次数时，你会忽然明白，我们永远无法通过点赞融入别人的生活，试图通过点赞和别人拉近距离是一件荒谬的事情。对于那些最好的朋友，并不会因为你没有给他的朋友圈点赞，而让彼此的友谊减分。</p> \n" +
                " <h2>时间带给我们东西，都在每个人自己知道的地方</h2> \n" +
                " <p>渐渐发现，我们都懒得再去发朋友圈了。看到有意思的东西，会默默选择收藏；拍到好玩的照片，仅仅只是放在手机相册里，不再那么热衷于分享；我们渐渐觉得，发朋友圈是一件没什么意思的事情。</p> \n" +
                " <p>你眼中一篇三观很正、观点新奇的文章，在别人眼中也可能只是一篇心灵鸡汤；你废寝忘食，没日没夜的做了一件自己感觉很牛逼的事情，在别人眼中有可能一无是处。</p> \n" +
                " <p>但也总有人觉得自己做过的事，看过的书比别人牛逼；自以为自己实现了对所有人的逼格碾压，以一种不知从何而来的优越感在朋友圈里自娱自high。</p> \n" +
                " <p>我们渐渐体会到，朋友圈已经不再是简简单单的朋友圈，它更像是一个社会圈！所以，我们无法逃离朋友圈！</p> \n" +
                "</div>";
        content = content.replace("<em>", "");
        content = content.replace("</em>", "");
        content = content.replace("<br>", "\n");
        content = content.replace("</br>", "");
        content = content.replace("&nbsp;", " ");
        content = content.replace("<div>", "\n");
        content =content.replace("<div ","\n");
//        content = content.replace(">", "");
        content = content.replace("</div>", "");
        content = content.replace("<p>", "");
        content = content.replace("</p>", "");


        System.err.println("result is \n" + content);


        String msg = null;
        for (; ; ) {
            if (msg == null) {
                return;
            }


            System.out.println("come here");

            String appVersion = "4.4.0";
            String uuid = "3.3.5";

            int result = appVersion.compareTo(uuid);

            System.out.println("the result is " + result);


        }


    }


}
