$(function() {
    // tab切换
    $(".guara_nav").on('click', function() {
        var index = $(this).index(".guara_nav");
        $(this).find('span').addClass('name_bj').parents(".guara_nav").siblings(".guara_nav").find("span").removeClass('name_bj');
        $(".system.guara_w").eq(index).show().siblings(".system.guara_w").hide();
        $(".guara_img").eq(index).show().siblings(".guara_img").hide();
        if (index == 2) {
            $(".secBox").show();
        } else {
            $(".secBox").hide();
        }

    })
    $(".menu ul li").mouseenter(function() {
        $(this).addClass("ative");
    }).mouseout(function() {
        $(this).removeClass("ative");
    })







})