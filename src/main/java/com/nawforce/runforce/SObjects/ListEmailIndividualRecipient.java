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
public class ListEmailIndividualRecipient extends SObject {
	public static SObjectType$<ListEmailIndividualRecipient> SObjectType;
	public static SObjectFields$<ListEmailIndividualRecipient> Fields;

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
	public Id RecipientId;
	public SObject Recipient;
	public Datetime SystemModstamp;

	public ListEmailIndividualRecipient clone$() {throw new java.lang.UnsupportedOperationException();}
	public ListEmailIndividualRecipient clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ListEmailIndividualRecipient clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ListEmailIndividualRecipient clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ListEmailIndividualRecipient clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
