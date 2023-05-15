// Problem Link: https://leetcode.com/problems/counter-ii/

var createCounter = function(init) {
    let a = init;
    return {
        increment: () => ++a,
        decrement: () => --a,
        reset: () => a=init,
    }
};