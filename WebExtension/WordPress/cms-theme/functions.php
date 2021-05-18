<?php
    register_sidebar(array(
        'id' => 'sidebar-1'
    ));

    add_theme_support( 'automatic-feed-links' );

    // Custom Menu
    register_nav_menu( 'navigation', 'ナビゲーション' );
?>