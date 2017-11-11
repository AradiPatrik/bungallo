$(function() {
  $(".date").datepicker({
    dateFormat: 'yy-mm-dd',
    firstDay: 1
  });

  $(document).on('click', '.date-input-group', function(e) {
    var $me = $(this);
    console.log($me);
    $parent = $me.parents('.date-input-group');
    $parent.toggleClass('open');
  });


  $(".date-input-group").on("change", function() {
    var $me = $(this),
      $selected = $me.val(),
      $parent = $me.parents('.date');
    $parent.find('.result').children('span').html($selected);
  });
});