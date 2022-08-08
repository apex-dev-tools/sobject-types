/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OpportunityChangeEvent extends SObject {
	public static SObjectType$<OpportunityChangeEvent> SObjectType;
	public static SObjectFields$<OpportunityChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal Amount;
	public Id CampaignId;
	public Campaign Campaign;
	public Object ChangeEventHeader;
	public Date CloseDate;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public Decimal ExpectedRevenue;
	public com.nawforce.runforce.System.String ForecastCategory;
	public com.nawforce.runforce.System.String ForecastCategoryName;
	public com.nawforce.runforce.System.Boolean HasOpportunityLineItem;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsClosed;
	public com.nawforce.runforce.System.Boolean IsExcludedFromTerritory2Filter;
	public com.nawforce.runforce.System.Boolean IsPrivate;
	public com.nawforce.runforce.System.Boolean IsSplit;
	public com.nawforce.runforce.System.Boolean IsWon;
	public Id LastAmountChangedHistoryId;
	public OpportunityHistory LastAmountChangedHistory;
	public Id LastCloseDateChangedHistoryId;
	public OpportunityHistory LastCloseDateChangedHistory;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastStageChangeDate;
	public com.nawforce.runforce.System.String LeadSource;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String NextStep;
	public Id OwnerId;
	public User Owner;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Decimal Probability;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.String StageName;
	public Id SyncedQuoteId;
	public Quote SyncedQuote;
	public Id Territory2Id;
	public Territory2 Territory2;
	public Decimal TotalOpportunityQuantity;
	public com.nawforce.runforce.System.String Type;

	public OpportunityChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public OpportunityChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
