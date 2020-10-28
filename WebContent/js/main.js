$(document).ready(function(){
    verifyTypePass();
    cpfMask();
    newOption();
    closeModal();
    openModal();
    submitMessage();
    function verifyTypePass() {
    $('.fas').on('click', function() {
        if($(this).hasClass('fa-eye')) {
            $(this).removeClass('fa-eye');
            $('.pass-label').attr("type", "text")
            $(this).addClass('fa-eye-slash');
        }else {
            $(this).removeClass('fa-eye-slash');
            $('.pass-label').attr("type", "password")
            $(this).addClass('fa-eye');
                }
        })
    }
    function cpfMask() {
        $('.cpf-label').mask('000.000.000-00', {reverse: true});

    }
    $('.main-banner').slick({
        infinite: true,
        slidesToShow: 3,
        slidesToScroll: 1,
        dots: true,
        arrows: false,
        // centerMode: true
    })

    function newOption() {
        $(".option1").on('click', function() {
            $(".bot-answer-item.hidden").removeClass("hidden");
            })
    }
    function closeModal(){
        $(".close-modal").on("click", function() {
            $(".chat-container").addClass("hidden");
            $(".bot-header").addClass("closed");
            $(".close-modal").addClass("hidden")
        })
    }
    function openModal() {
        $(".bot-header").on("click", function() {
            $(".chat-container").removeClass("hidden");
            $(".close-modal").removeClass("hidden");
            $(".bot-header").removeClass("closed");

        })
    }
    function submitMessage() {
        $(".submit-question").on("click", function() {
            let html = `
                <div class="bot-answer-item">
                    <p class="bot-answer">${$(".sendMessage")[0].value}</p>
                </div>
            `
            $(".chat-container").append(html)
            // console.log($(".sendMessage")[0].value)
        })
    }

    

})


