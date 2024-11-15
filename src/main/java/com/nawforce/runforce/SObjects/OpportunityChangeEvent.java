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
	public Id ContractId;
	public Contract Contract;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Decimal ExpectedRevenue;
	public String ForecastCategory;
	public String ForecastCategoryName;
	public Boolean HasOpportunityLineItem;
	public Id Id;
	public Boolean IsClosed;
	public Boolean IsExcludedFromTerritory2Filter;
	public Boolean IsPrivate;
	public Boolean IsSplit;
	public Boolean IsWon;
	public Id LastAmountChangedHistoryId;
	public OpportunityHistory LastAmountChangedHistory;
	public Id LastCloseDateChangedHistoryId;
	public OpportunityHistory LastCloseDateChangedHistory;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastStageChangeDate;
	public String LeadSource;
	public String Name;
	public String NextStep;
	public Id OwnerId;
	public User Owner;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Decimal Probability;
	public String ReplayId;
	public String StageName;
	public Id SyncedQuoteId;
	public Quote SyncedQuote;
	public Id Territory2Id;
	public Territory2 Territory2;
	public Decimal TotalOpportunityQuantity;
	public String Type;

	public OpportunityChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public OpportunityChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
