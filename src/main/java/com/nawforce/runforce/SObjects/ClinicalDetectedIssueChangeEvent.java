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
public class ClinicalDetectedIssueChangeEvent extends SObject {
	public static SObjectType$<ClinicalDetectedIssueChangeEvent> SObjectType;
	public static SObjectFields$<ClinicalDetectedIssueChangeEvent> Fields;

	public Id CategoryCodeId;
	public SObject CategoryCode;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Id Id;
	public Datetime IdentificationEndDateTime;
	public Datetime IdentificationStartDateTime;
	public Id IdentifiedById;
	public SObject IdentifiedBy;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MedicationTherapyReviewId;
	public MedicationTherapyReview MedicationTherapyReview;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public String ReferenceUri;
	public String ReplayId;
	public String SeverityLevel;
	public Datetime SourceSysModifiedDateTime;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;

	public ClinicalDetectedIssueChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClinicalDetectedIssueChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalDetectedIssueChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalDetectedIssueChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalDetectedIssueChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
