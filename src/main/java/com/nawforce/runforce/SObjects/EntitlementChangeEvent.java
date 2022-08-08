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
	public com.nawforce.runforce.System.Integer CasesPerEntitlement;
	public Object ChangeEventHeader;
	public Id ContractLineItemId;
	public ContractLineItem ContractLineItem;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Date EndDate;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsPerIncident;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LocationId;
	public Location Location;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer RemainingCases;
	public com.nawforce.runforce.System.Integer RemainingWorkOrders;
	public com.nawforce.runforce.System.String ReplayId;
	public Id ServiceContractId;
	public ServiceContract ServiceContract;
	public Id SlaProcessId;
	public SlaProcess SlaProcess;
	public Date StartDate;
	public Id SvcApptBookingWindowsId;
	public OperatingHours SvcApptBookingWindows;
	public com.nawforce.runforce.System.String Type;
	public com.nawforce.runforce.System.Integer WorkOrdersPerEntitlement;

	public EntitlementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EntitlementChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EntitlementChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EntitlementChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EntitlementChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
