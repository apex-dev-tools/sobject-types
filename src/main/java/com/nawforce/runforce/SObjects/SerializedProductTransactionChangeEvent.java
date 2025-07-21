/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SerializedProductTransactionChangeEvent extends SObject {
	public static SObjectType$<SerializedProductTransactionChangeEvent> SObjectType;
	public static SObjectFields$<SerializedProductTransactionChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public String ReplayId;
	public Id SerializedProductId;
	public SerializedProduct SerializedProduct;
	public String TransactionType;

	public SerializedProductTransactionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SerializedProductTransactionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SerializedProductTransactionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SerializedProductTransactionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SerializedProductTransactionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
