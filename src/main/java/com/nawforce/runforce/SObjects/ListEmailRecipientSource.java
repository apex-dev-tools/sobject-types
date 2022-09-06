/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ListEmailRecipientSource extends SObject {
	public static SObjectType$<ListEmailRecipientSource> SObjectType;
	public static SObjectFields$<ListEmailRecipientSource> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ListEmailId;
	public ListEmail ListEmail;
	public String Name;
	public Id SourceListId;
	public Name SourceList;
	public String SourceType;
	public Datetime SystemModstamp;

	public ListEmailRecipientSource clone$() {throw new java.lang.UnsupportedOperationException();}
	public ListEmailRecipientSource clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ListEmailRecipientSource clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ListEmailRecipientSource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ListEmailRecipientSource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
