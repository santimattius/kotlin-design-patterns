package structural_design_patterns.composite

class Developer(
    private val empId: Long,
    private val name: String,
    private val position: String,
) : Employee {

    override fun showEmployeeDetails() {
        println("$empId $name");
    }
}