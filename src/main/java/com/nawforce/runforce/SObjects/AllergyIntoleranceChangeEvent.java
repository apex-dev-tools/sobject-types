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
public class AllergyIntoleranceChangeEvent extends SObject {
	public static SObjectType$<AllergyIntoleranceChangeEvent> SObjectType;
	public static SObjectFields$<AllergyIntoleranceChangeEvent> Fields;

	public Id AssertionSourceId;
	public SObject AssertionSource;
	public String Category;
	public Object ChangeEventHeader;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CodeId;
	public CodeSetBundle Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastOccurrenceDateTime;
	public String Name;
	public Datetime OnsetEndDateTime;
	public Datetime OnsetStartDateTime;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public Datetime RecordCreationDateTime;
	public Id RecordCreatorId;
	public SObject RecordCreator;
	public String ReplayId;
	public String Severity;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public String Type;
	public String VerificationStatus;

	public AllergyIntoleranceChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AllergyIntoleranceChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AllergyIntoleranceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AllergyIntoleranceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AllergyIntoleranceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
