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
public class ClinicalDetectedIssueDetailChangeEvent extends SObject {
	public static SObjectType$<ClinicalDetectedIssueDetailChangeEvent> SObjectType;
	public static SObjectFields$<ClinicalDetectedIssueDetailChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ClinicalDetectedIssueId;
	public ClinicalDetectedIssue ClinicalDetectedIssue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DetailCodeId;
	public SObject DetailCode;
	public Id DetailRecordId;
	public SObject DetailRecord;
	public String DetailType;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MitigationAuthorId;
	public SObject MitigationAuthor;
	public Datetime MitigationAuthoringDateTime;
	public String Name;
	public String ReplayId;

	public ClinicalDetectedIssueDetailChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClinicalDetectedIssueDetailChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalDetectedIssueDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalDetectedIssueDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalDetectedIssueDetailChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
