package structural_design_patterns.composite

class CompanyDirectory : Employee {

    private val employeeList = mutableListOf<Employee>()

    override fun showEmployeeDetails() {
        employeeList.forEach {
            it.showEmployeeDetails()
        }
    }

    fun addEmployee(employee: Employee) {
        employeeList.add(employee)
    }

    fun removeEmployee(employee: Employee) {
        employeeList.remove(employee)
    }
}