/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CarePgmEnrolleeWkOrdStepChangeEvent extends SObject {
	public static SObjectType$<CarePgmEnrolleeWkOrdStepChangeEvent> SObjectType;
	public static SObjectFields$<CarePgmEnrolleeWkOrdStepChangeEvent> Fields;

	public Id ActionPlanTemplateId;
	public ActionPlanTemplate ActionPlanTemplate;
	public Boolean AreAllTasksCompleted;
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
	public Id ParentEnrolleeWorkOrderId;
	public CarePgmEnrolleeWorkOrder ParentEnrolleeWorkOrder;
	public String ReplayId;
	public Integer SequenceNumber;
	public Datetime StartDateTime;
	public String Status;
	public Id WorkTypeStepId;
	public WorkTypeStep WorkTypeStep;

	public CarePgmEnrolleeWkOrdStepChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWkOrdStepChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWkOrdStepChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWkOrdStepChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CarePgmEnrolleeWkOrdStepChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
