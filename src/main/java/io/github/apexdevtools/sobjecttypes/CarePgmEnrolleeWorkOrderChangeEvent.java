/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CarePgmEnrolleeWorkOrderChangeEvent extends SObject {
	public static SObjectType$<CarePgmEnrolleeWorkOrderChangeEvent> SObjectType;
	public static SObjectFields$<CarePgmEnrolleeWorkOrderChangeEvent> Fields;

	public Id CareProgramEnrolleeId;
	public CareProgramEnrollee CareProgramEnrollee;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndDateTime;
	public Id Id;
	public Boolean IsCustodyCompleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id NextWorkOrderId;
	public CarePgmEnrolleeWorkOrder NextWorkOrder;
	public Id PreviousWorkOrderId;
	public CarePgmEnrolleeWorkOrder PreviousWorkOrder;
	public String ReplayId;
	public Id ServiceAppointmentId;
	public ServiceAppointment ServiceAppointment;
	public Datetime StartDateTime;
	public String Status;
	public Id WorkTypeId;
	public WorkType WorkType;

	public CarePgmEnrolleeWorkOrderChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWorkOrderChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWorkOrderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWorkOrderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWorkOrderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
