/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class HealthConditionChangeEvent extends SObject {
	public static SObjectType$<HealthConditionChangeEvent> SObjectType;
	public static SObjectFields$<HealthConditionChangeEvent> Fields;

	public Datetime AbatementEndDateTime;
	public Datetime AbatementStartDateTime;
	public Id AssertionSourceId;
	public SObject AssertionSource;
	public Object ChangeEventHeader;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id ConditionCodeId;
	public CodeSetBundle ConditionCode;
	public String ConditionStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DiagnosticStatus;
	public String Division;
	public String ExtlProblemDefIdentifier;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime OnsetEndDateTime;
	public Datetime OnsetStartDateTime;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public Id ProblemDefinitionId;
	public ProblemDefinition ProblemDefinition;
	public String ProblemDescription;
	public String ProblemName;
	public Datetime RecordCreationDateTime;
	public Id RecordCreatorId;
	public SObject RecordCreator;
	public String ReplayId;
	public String Severity;
	public Id SiteId;
	public CodeSetBundle Site;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Id StageId;
	public CodeSetBundle Stage;
	public String Type;

	public HealthConditionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthConditionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthConditionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthConditionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthConditionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
