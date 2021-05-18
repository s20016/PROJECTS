<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="http://netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="<?php echo get_stylesheet_uri(); ?>">
    <title><?php bloginfo( 'name' ); ?><?php wp_title(); ?></title>
    <link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
    <?php wp_head(); ?>
  </head>

  <body <?php body_class(); ?>>
    <header>
      <div class="siteinfo">
        <div class="container">
          <h1>
            <a href="<?php echo home_url(); ?>">
            <?php bloginfo( 'name' ); ?></a>
          </h1>
          <p><i class="fa fa-wordpress"></i></p>
        </div>
      </div>
    </header>