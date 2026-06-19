var checkIfInstanceOf = function(obj, classFunction) {
    if (typeof classFunction !== 'function') {
        return false;
    } else if (obj === null || obj === undefined) {
        return false;
    } else if (Object(obj) instanceof classFunction) {
        return true;
    }  else {
        return false;
    }
};
