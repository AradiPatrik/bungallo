$(function() {
  $(".datepicker").datepicker({
    dateFormat: 'yy/mm/dd'
  });
})

$(document).on('click', '.datepicker .input', function(e) {
  var $me = $(this),
    $parent = $me.parents('.date-picker');
  $parent.toggleClass('open');
});