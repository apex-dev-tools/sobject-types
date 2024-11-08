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
public class RevenueTransactionErrorLog extends SObject {
	public static SObjectType$<RevenueTransactionErrorLog> SObjectType;
	public static SObjectFields$<RevenueTransactionErrorLog> Fields;

	public Id AsyncOperationTrackerId;
	public AsyncOperationTracker AsyncOperationTracker;
	public String Category;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorCode;
	public String ErrorLogNumber;
	public String ErrorMessage;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public Name Owner;
	public Id PrimaryRecordId;
	public Name PrimaryRecord;
	public Id RelatedRecord2Id;
	public Name RelatedRecord2;
	public Id RelatedRecordId;
	public Name RelatedRecord;
	public String RequestIdentifier;
	public Datetime SystemModstamp;

	public RevenueTransactionErrorLogShare[] Shares;

	public RevenueTransactionErrorLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public RevenueTransactionErrorLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RevenueTransactionErrorLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RevenueTransactionErrorLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RevenueTransactionErrorLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
