/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class NetworkDiscoverableLogin extends SObject {
	public static SObjectType$<NetworkDiscoverableLogin> SObjectType;
	public static SObjectFields$<NetworkDiscoverableLogin> Fields;

	public Id ApexHandlerId;
	public ApexClass ApexHandler;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id ExecuteApexHandlerAsId;
	public User ExecuteApexHandlerAs;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id NetworkId;
	public Network Network;
	public Datetime SystemModstamp;
	public String UsernameLabel;

	public NetworkDiscoverableLogin clone$() {throw new java.lang.UnsupportedOperationException();}
	public NetworkDiscoverableLogin clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NetworkDiscoverableLogin clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NetworkDiscoverableLogin clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NetworkDiscoverableLogin clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
