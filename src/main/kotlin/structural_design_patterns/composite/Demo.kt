package structural_design_patterns.composite

fun main() {
    val dev1 = Developer(empId = 100, name = "Juan", position = "Pro Developer")
    val dev2 = Developer(empId = 101, name = "Pedro", position = "Developer")
    val engDirectory = CompanyDirectory().apply {
        addEmployee(dev1)
        addEmployee(dev2)
    }

    val man1 = Manager(empId = 200, name = "Luis", position = "SEO Manager")
    val man2 = Manager(empId = 201, name = "Diego", position = "Super Manager")

    val accDirectory = CompanyDirectory().apply {
        addEmployee(man1)
        addEmployee(man2)
    }

    val directory = CompanyDirectory().apply {
        addEmployee(engDirectory)
        addEmployee(accDirectory)
    }

    directory.showEmployeeDetails()
}