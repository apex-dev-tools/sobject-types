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
public class MyDomainDiscoverableLogin extends SObject {
	public static SObjectType$<MyDomainDiscoverableLogin> SObjectType;
	public static SObjectFields$<MyDomainDiscoverableLogin> Fields;

	public Id ApexHandlerId;
	public ApexClass ApexHandler;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id ExecuteApexHandlerAsId;
	public User ExecuteApexHandlerAs;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Datetime SystemModstamp;
	public String UsernameLabel;

	public MyDomainDiscoverableLogin clone$() {throw new java.lang.UnsupportedOperationException();}
	public MyDomainDiscoverableLogin clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MyDomainDiscoverableLogin clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MyDomainDiscoverableLogin clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MyDomainDiscoverableLogin clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
