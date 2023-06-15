const regex = /[.]+/g;
const getLocalName = (name) => {
    name = name.split('+')[0];
    name = name.replaceAll('.', '');
    return name;
};

const numUniqueEmails = function (emails) {
    const set = new Set();
    for (let i = 0; i < emails.length; i++) {
        const email = emails[i];
        const [localName, domain] = email.split('@');
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