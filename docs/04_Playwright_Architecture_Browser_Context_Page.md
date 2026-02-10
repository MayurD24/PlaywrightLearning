# Playwright Architecture: Browser, Context, and Page

## Objective

Understand Playwright’s core architecture and execution flow.  
This knowledge is critical for writing stable automation code and answering architecture-related interview questions.

By the end of this lesson, you should clearly understand:
- How Playwright executes tests internally
- The role of Browser, BrowserContext, and Page
- Why BrowserContext is essential for real-world automation

---

## Playwright Execution Flow

**Playwright follows a simple and powerful hierarchy:**
Playwright → Browser → BrowserContext → Page → Actions

This design enables fast execution, test isolation, and parallelism.

---

## Browser

### What is a Browser?

A **Browser** represents the actual browser engine instance:
- Chromium
- Firefox
- WebKit

It is a heavy resource and is typically created **once per test run**.

### Key Characteristics
- Represents the browser process
- Can host multiple browser contexts
- Closed at the end of execution

### Real-World Usage
- Launch browser at suite start
- Close browser at suite end
- Share browser across multiple tests using contexts

---

## BrowserContext

### What is a BrowserContext?

A **BrowserContext** is an isolated browser session.

Each context has:
- Its own cookies
- Its own cache
- Its own local storage
- Its own session state

A BrowserContext is equivalent to an **Incognito window**.

---

### Why BrowserContext Is Important

BrowserContext exists to:
- Ensure **test isolation**
- Prevent data leakage between tests
- Support **parallel execution**
- Enable multi-user testing scenarios

### Real-World Example

- User A logs in within Context A
- User B logs in within Context B
- Both sessions run in parallel without conflict

This is difficult to achieve cleanly in Selenium.

---

## Page

### What is a Page?

A **Page** represents a single browser tab within a BrowserContext.

All user interactions happen on the Page:
- Navigation
- Clicking elements
- Typing text
- Validations and assertions

In real automation projects, most test logic is written using the Page object.

---

## Relationship Between Browser, Context, and Page

One Browser
├── BrowserContext 1
│ ├── Page 1
│ └── Page 2
└── BrowserContext 2
└── Page 1

This design allows:
- Multiple independent test sessions
- Multiple tabs per test if needed
- Clean and scalable automation

---

# Interview Perspective – Playwright Architecture

## Common Interview Questions

### Q: Explain Playwright architecture
Playwright uses a **Browser → BrowserContext → Page** architecture.  
The browser represents the engine, browser contexts provide isolated sessions, and pages represent individual tabs where user interactions are performed.

---

### Q: Why do we need BrowserContext?
BrowserContext provides **test isolation** by separating cookies, cache, and storage.  
It enables **parallel execution** and **multi-user testing scenarios** without test interference.

---

### Q: Where do actions like click and type happen?
All user interactions such as clicking, typing, and navigation are performed on the **Page** object.

---

## Common Beginner Mistakes

- Skipping BrowserContext creation
- Sharing a single Page across multiple tests
- Not closing browser and context resources properly
- Treating Playwright the same way as Selenium

---

## Best Practices Used in Real Projects

- Use **one browser per test run**
- Create **one browser context per test**
- Ensure **proper resource cleanup**
- Design tests with **isolation and parallel execution in mind**