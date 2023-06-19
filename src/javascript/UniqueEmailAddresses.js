const regex = /[.]+/g;
const getLocalName = (name) => {
    name = name.split('+')[0];
    name = name.replaceAll('.', '');
    return name;
};

const numUniqueEmails = function (emails) {
    const set = new Set();
    for (const element of emails) {
        const [localName, domain] = element.split('@');
        const baseEmail = `${getLocalName(localName)}@${domain}`;
        if (!set.has(baseEmail)) {
            set.add(baseEmail);
        }
    }
    return set.size;
};
let emails = [
    "test.email+alex@leetcode.com",
    "test.e.mail+bob.cathy@leetcode.com",
    "testemail+david@lee.tcode.com"];

let count = numUniqueEmails(emails);
console.log(count);