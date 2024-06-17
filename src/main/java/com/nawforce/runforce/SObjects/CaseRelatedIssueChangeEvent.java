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
public class CaseRelatedIssueChangeEvent extends SObject {
	public static SObjectType$<CaseRelatedIssueChangeEvent> SObjectType;
	public static SObjectFields$<CaseRelatedIssueChangeEvent> Fields;

	public Id CaseId;
	public Case Case;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String RelatedEntityType;
	public Id RelatedIssueId;
	public SObject RelatedIssue;
	public String RelationshipType;
	public String ReplayId;

	public CaseRelatedIssueChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CaseRelatedIssueChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CaseRelatedIssueChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CaseRelatedIssueChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CaseRelatedIssueChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
