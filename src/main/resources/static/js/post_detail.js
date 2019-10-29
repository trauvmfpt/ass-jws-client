$(".big_image").click(function (){
    var imgId = $(this).data('id');
        $.ajax({
            type: 'GET',
            url: "http://localhost:9001/image/" + imgId,
            success: function (result) {
                $(".modal_hotel_image").find("img").attr("src", result.data.source);
                $("#image_comment_form").find('input[name="imageId"]').val(result.data.id);
                $(".modal_reviews").html("");
               if(result.data.comments != null){
                   for(var i = 0; i < result.data.comments.length; i++){
                       var html = "<div class=\"review\">\n" +
                           "                                                    <div class=\"row\">\n" +
                           "                                                        <div class=\"col-md-1\" style=\"margin-right: 15px;\">\n" +
                           "                                                            <div class=\"review_image\">\n" +
                           "                                                                <img src=\"/images/user.png\">\n" +
                           "                                                            </div>\n" +
                           "                                                        </div>\n" +
                           "                                                        <div class=\"col-md-10\" style='margin-left: 10px;'>\n" +
                           "                                                            <div class=\"review_content\">\n" +
                           "                                                                <div class=\"modal_comment_content\">" + result.data.comments[i].content+ "</div>\n" +
                           "                                                                <div class=\"review_name modal_comment_user\">" + result.data.comments[i].userName+ "</div>\n" +
                           "                                                            </div>\n" +
                           "                                                        </div>\n" +
                           "                                                    </div>\n" +
                           "                                                </div>"
                   }
               }
               $(".modal_reviews").html(html);
                $(".rate_img").attr('data-img-id', result.data.id);
                console.log(result)

                if(result.data.ratings != null){
                    for(var i = 0; i < result.data.ratings.length; i++){
                        if(result.data.ratings[i].userName == $("#loggedInUser").find("a").text()){
                            $(".rating_numbers").text("You and " + result.data.ratings.length + " others have liked this image");
                            $(".rate_img").css("color", "skyblue");
                            $(".img_rating").attr('data-status', false);
                        }
                        else{
                            $(".rating_numbers").text(result.data.ratings.length + " others have liked this image");
                            $(".img_rating").attr('data-status', true);
                        }
                    }
                }
                else{
                    $(".rating_numbers").text("Be first to like this image");
                }
               $("#modaltest").modal("show");
            },
            error: function (xhr, textStatus, errorThrown) {
                alert("error");
            }
        });
});

$(".rate_post").click(function (){
    var formData = {
        "postId" : $(this).parent().data('post-id'),
        "imageId" : $(this).data('imgid'),
        "status" : $(".post_rating").data("status"),
    };
     rate(formData);
});

$(".rate_img").click(function (){
    var formData = {
        "postId" : 0,
        "imageId" : $(this).data('img-id'),
        "status" : $(".img_rating").data("status"),
    };
    rate(formData);
});

function rate(formData){
    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: "http://localhost:9001/rating/create",
        data: JSON.stringify(formData),
        success: function (result) {
            location.reload();
        },
        error: function (xhr, textStatus, errorThrown) {
            alert("error");
        }
    });
}

$(document).ready(function () {
   if($(".post_rating").data("status") == false){
       $(".rate_post").css("color", "skyblue");
   }
});