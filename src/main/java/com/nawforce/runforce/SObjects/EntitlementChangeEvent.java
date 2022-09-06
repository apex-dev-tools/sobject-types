/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EntitlementChangeEvent extends SObject {
	public static SObjectType$<EntitlementChangeEvent> SObjectType;
	public static SObjectFields$<EntitlementChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id AssetId;
	public Asset Asset;
	public Id AssetWarrantyId;
	public AssetWarranty AssetWarranty;
	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public Integer CasesPerEntitlement;
	public Object ChangeEventHeader;
	public Id ContractLineItemId;
	public ContractLineItem ContractLineItem;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public Id Id;
	public Boolean IsPerIncident;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LocationId;
	public Location Location;
	public String Name;
	public Integer RemainingCases;
	public Integer RemainingWorkOrders;
	public String ReplayId;
	public Id ServiceContractId;
	public ServiceContract ServiceContract;
	public Id SlaProcessId;
	public SlaProcess SlaProcess;
	public Date StartDate;
	public Id SvcApptBookingWindowsId;
	public OperatingHours SvcApptBookingWindows;
	public String Type;
	public Integer WorkOrdersPerEntitlement;

	public EntitlementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EntitlementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EntitlementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EntitlementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EntitlementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
