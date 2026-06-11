/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class RegulatoryCodeViolationChangeEvent extends SObject {
	public static SObjectType$<RegulatoryCodeViolationChangeEvent> SObjectType;
	public static SObjectFields$<RegulatoryCodeViolationChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Datetime ComplianceDueDate;
	public String CorrectiveActionDescription;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DateCreated;
	public Datetime DateResolved;
	public String Description;
	public Id Id;
	public Id InspectionAssmntIndId;
	public InspectionAssessmentInd InspectionAssmntInd;
	public Id InspectionId;
	public Visit Inspection;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String Priority;
	public Integer RecurrenceCount;
	public Id RegulatoryCodeId;
	public RegulatoryCode RegulatoryCode;
	public String ReplayId;
	public String ResolutionNotes;
	public Id ResponseContextId;
	public SObject ResponseContext;
	public Id ResponseId;
	public InspectionAssessmentInd Response;
	public String Status;
	public Id ViolationTypeId;
	public ViolationType ViolationType;

	public RegulatoryCodeViolationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryCodeViolationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryCodeViolationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryCodeViolationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryCodeViolationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
