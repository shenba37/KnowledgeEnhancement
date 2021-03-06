package com.myproject.datamodels.entities;

import com.myproject.datamodels.enums.Priority;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

/*
WorkOrder :
A work order is usually a task or a job for a customer, that can be scheduled or assigned to someone.

Such an order may be from a customer request or created internally within the organization.
Work Orders may also be created as follow ups to Inspections or Audits. A work order may be for products or services.

A Work Order may include one or more of the following:
Instructions
Cost estimates
Forms
Date and time to execute the work order
Information about the location and entities to execute the work order and
The person to whom the work order is assigned
In a manufacturing environment, a work order is converted from a sales order to show that work is about to begin on the manufacture,
building or engineering of the products requested by the customer.

In a service environment, a work order can be equivalent to a service order where the WO records the location,
date and time the service is carried out and the nature of work that is done.
The type of personnel (e.g. job position) may also be listed on the WO. A rate (e.g. $/hr, $/week) and also the total
number of hours worked and total value is also shown on the work order.

A work order may be a maintenance or repair request from students, faculty or staff in a university.[2][3]
Orders received from outside an organization are often dispatched (reviewed and scheduled) before being executed.[4] [5]Work orders may be for preventive maintenance[6]
Contractors may use a single job work order and invoice form that contains the customer information, describes the work performed, lists charges for material and labor, and can be given to the customer as an invoice.[7]
A job order is an internal document extensively used by projects-based, manufacturing, building and fabrication businesses. A job order may be for products and/or services. In a manufacturing environment, a job order is used to signal the start of a manufacturing process and will most probably be linked to a bill of material. Hence, the job order will probably state:
the quantity of the product to be manufactured, built or fabricated
the amount of raw material to be used, its price and amount
the types of labour required, rate (per hour or per unit) and amount
the machine utilisation for each machine during the routing process, its rate and amount

In a service environment, a job order cannot be the equivalent to a work or service order where the job order records
the location, date and time the service is carried out and the nature of service that was carried out,
the work order does not. The type of personnel (e.g. job position) may also be listed on the job order.

A rate (e.g. $/hr, $/week) and also the total number of hours worked and total value is also shown.
 */

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@ToString
@Deprecated
public class WorkOrder {

    private int id;
    private String description;

    private Priority priority;
    private Employee assignee;
    private List<Employee> watchers;
    //private Status status;

    private LocalDateTime dueDate;
    private String originalEstimate;
    private String remainingEstimate;
    private List<String> workLog;
    private String comments;

    private LocalDateTime createdOn;
    private Employee createdBy;
    private LocalDateTime modifiedOn;
    private Employee modifiedBy;
}
