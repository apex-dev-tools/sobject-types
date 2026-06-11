/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CampaignChangeEvent extends SObject {
	public static SObjectType$<CampaignChangeEvent> SObjectType;
	public static SObjectFields$<CampaignChangeEvent> Fields;

	public Decimal ActualCost;
	public Decimal AmountAllOpportunities;
	public Decimal AmountWonOpportunities;
	public Decimal BudgetedCost;
	public Id CampaignImageId;
	public ContentDocument CampaignImage;
	public Id CampaignMemberRecordTypeId;
	public RecordType CampaignMemberRecordType;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Decimal ExpectedResponse;
	public Decimal ExpectedRevenue;
	public Decimal HierarchyActualCost;
	public Decimal HierarchyAmountAllOpportunities;
	public Decimal HierarchyAmountWonOpportunities;
	public Decimal HierarchyBudgetedCost;
	public Decimal HierarchyExpectedRevenue;
	public Integer HierarchyNumberOfContacts;
	public Integer HierarchyNumberOfConvertedLeads;
	public Integer HierarchyNumberOfLeads;
	public Integer HierarchyNumberOfOpportunities;
	public Integer HierarchyNumberOfResponses;
	public Integer HierarchyNumberOfWonOpportunities;
	public Decimal HierarchyNumberSent;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer NumberOfContacts;
	public Integer NumberOfConvertedLeads;
	public Integer NumberOfLeads;
	public Integer NumberOfOpportunities;
	public Integer NumberOfResponses;
	public Integer NumberOfWonOpportunities;
	public Decimal NumberSent;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public Campaign Parent;
	public String ReplayId;
	public Date StartDate;
	public String Status;
	public String Type;

	public CampaignChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CampaignChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CampaignChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CampaignChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CampaignChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
