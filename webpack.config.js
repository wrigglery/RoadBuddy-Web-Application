var path = require('path');

module.exports = {
    entry: './src/main/resources/static/js/app.js',
    devtool: 'sourcemaps',
    cache: true,
    debug: true,
    output: {
        path: __dirname,
        filename: './src/main/resources/static/assets/bundle.js'
    },
    module: {
        loaders: [
            {
                test: [ /\.js?$/, /\.jsx?$/ ],
                loader: 'babel',
                exclude: /(node_modules|bower_components)/,
                query: {
                    cacheDirectory: true,
                    presets: [ 'es2015', 'stage-0', 'react' ]
                }
            },
            {
                test: /\.json$/,
                loader: 'json-loader'
            }
        ]
    },
    resolve: {
        root: __dirname,
        modulesDirectories: [ 'node_modules', 'bower_components' ],
        extensions: [ '', '.js', '.jsx' ]
    }
};