/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AssignedResourceChangeEvent extends SObject {
	public static SObjectType$<AssignedResourceChangeEvent> SObjectType;
	public static SObjectFields$<AssignedResourceChangeEvent> Fields;

	public Decimal ActualTravelTime;
	public String AssignedResourceNumber;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal EstimatedTravelTime;
	public Id EventId;
	public Event Event;
	public Id Id;
	public Boolean IsRequiredResource;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ReplayId;
	public String Role;
	public Id ServiceAppointmentId;
	public ServiceAppointment ServiceAppointment;
	public Id ServiceCrewId;
	public ServiceCrew ServiceCrew;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public String Transaction;
	public Integer TravelTimeBuffer;

	public AssignedResourceChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssignedResourceChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssignedResourceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssignedResourceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssignedResourceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
