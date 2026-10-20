/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.eventbus.ChangeEventHeader;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ViolationEnforcementActionChangeEvent extends SObject {
	public static SObjectType$<ViolationEnforcementActionChangeEvent> SObjectType;
	public static SObjectFields$<ViolationEnforcementActionChangeEvent> Fields;

	public ChangeEventHeader ChangeEventHeader;
	public Datetime ComplianceDueDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DateCreated;
	public Datetime DateResolved;
	public Integer DaysOpen;
	public String Description;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Priority;
	public String ReplayId;
	public String ResolutionNotes;
	public String Status;
	public String Type;
	public Id ViolationId;
	public RegulatoryCodeViolation Violation;

	public ViolationEnforcementActionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ViolationEnforcementActionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ViolationEnforcementActionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ViolationEnforcementActionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ViolationEnforcementActionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
