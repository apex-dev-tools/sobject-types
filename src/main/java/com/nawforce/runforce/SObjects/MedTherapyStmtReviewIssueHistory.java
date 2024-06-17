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
public class MedTherapyStmtReviewIssueHistory extends SObject {
	public static SObjectType$<MedTherapyStmtReviewIssueHistory> SObjectType;
	public static SObjectFields$<MedTherapyStmtReviewIssueHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Id MedTherapyStmtReviewIssueId;
	public MedTherapyStmtReviewIssue MedTherapyStmtReviewIssue;
	public Object NewValue;
	public Object OldValue;

	public MedTherapyStmtReviewIssueHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedTherapyStmtReviewIssueHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedTherapyStmtReviewIssueHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedTherapyStmtReviewIssueHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedTherapyStmtReviewIssueHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
