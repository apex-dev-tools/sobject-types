/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ListEmailSentResult extends SObject {
	public static SObjectType$<ListEmailSentResult> SObjectType;
	public static SObjectFields$<ListEmailSentResult> Fields;

	public Id ActivityId;
	public Task Activity;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EmailAddress;
	public String Headers;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ListEmailId;
	public ListEmail ListEmail;
	public String MessageIdentifier;
	public String Name;
	public String Reason;
	public Id RecipientId;
	public Name Recipient;
	public String Result;
	public Datetime SystemModstamp;
	public String ThreadIdentifier;

	public ListEmailSentResult clone$() {throw new java.lang.UnsupportedOperationException();}
	public ListEmailSentResult clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ListEmailSentResult clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ListEmailSentResult clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ListEmailSentResult clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
