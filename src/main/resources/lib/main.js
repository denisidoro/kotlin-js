requirejs.config({

    paths: {
        kotlin: 'kotlin',
        app: 'hello-kotlin_main'
    }
});

requirejs(["hello-kotlin_main"], function (app) {
    app.sample.main();
});
