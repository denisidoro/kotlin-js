requirejs.config({

    paths: {
        jquery: 'https://code.jquery.com/jquery-3.1.1',
        kotlin: 'kotlin',
        app: 'hello-kotlin_main'
    }
});

requirejs(["hello-kotlin_main"], function (app) {
    app.sample.main();
});
