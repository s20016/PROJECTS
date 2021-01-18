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
            <!-- <p><?php bloginfo( 'description' ) ?></p> -->
            <p><i class="fa fa-wordpress"></i></p>
        </div>
    </div>
    </header>

    <div class="container">
        <?php if( is_category() ): ?>
            <h1 class="archive-title">
                <i class="fa fa-folder-open"></i>
                「<?php single_cat_title(); ?>」に関する記事
            </h1>
        <?php endif; ?>

        <?php if(is_month()): ?>
            <h1 class="archive-title">
                <i class="fa fa-clock-o"></i>
                <?php echo get_the_date( 'Y月n月' ); ?>に投稿した記事
            </h1>
        <?php endif; ?>

    <?php if(have_posts()): while(have_posts()): the_post(); ?>

    <article <?php post_class(); ?>>

        <?php if ( is_single() ): ?>
            <h1><?php the_title(); ?></h1>
        <?php else: ?>
        <h1><a href="<?php the_permalink(); ?>">
        <?php the_title(); ?></a></h1>
        <?php endif; ?>

        <div class="postinfo">
            <time datetime="<?php echo get_the_date( 'Y-m-d' ) ?>">
                <i class="fa fa-clock-o"></i>
                <?php echo get_the_date(); ?>
            </time>

            <span class="postcat">
                <i class="fa fa-folder-open"></i>
                <?php the_category( ', ' ); ?>
            </span>

            <span class="postcom">
            <i class="fa fa-comment"></i>
                <a href="<?php comments_link(); ?>">
                    <?php comments_number(
                        'Comment',
                        'Comment (1 Comment)',
                        'Comment (% Comments)'
                    ); ?>
                </a>
            </span>
        </div>

        <?php the_content(); ?>

        <?php if( is_single() ): ?>
        <div class="pagenav">
            <span class="old">
                <?php previous_post_link( '%link', '<i class="fa fa-chevron-circle-left"></i> %title' ); ?>
            </span>

            <span class="new">
                <?php next_post_link( '%link', '%title <i class="fa fa-chevron-circle-right"></i>' ); ?>
            </span>
        </div>
        <?php endif; ?>
        <?php comments_template(); ?>
    </article>

    <?php endwhile; endif; ?>

    <?php if ( $wp_query->max_num_pages > 1 ): ?>
        <div class="pagenav">
            <span class="old">
                <?php next_posts_link('<i class="fa fa-chevron-circle-left"></i> 古い記事' ); ?>
            </span>

            <span class="new">
                <?php previous_posts_link( '新しい記事 <i class="fa fa-chevron-circle-right"></i>' ); ?>
            </span>
        </div>
    <?php endif; ?>

    <div class="blogmenu">
        <ul>
            <?php dynamic_sidebar(); ?>

            <li class="widget">
                <ul>
                    <li>
                        <a href="<?php bloginfo( 'rss2_url' ); ?>">
                        <i class="fa fa-rss-square"></i>RSS</a>
                    </li>
                <ul>
            </li>
        </ul>
    </div>

    </div>

    <footer>
        <div class="container">
            <small>Copyright &copy; <?php bloginfo( 'name' ); ?></small>
        </div>
    </footer>
    <?php wp_footer(); ?>
</body>
</html>