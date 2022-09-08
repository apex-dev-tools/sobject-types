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
public class NetworkSelfRegistration extends SObject {
	public static SObjectType$<NetworkSelfRegistration> SObjectType;
	public static SObjectFields$<NetworkSelfRegistration> Fields;

	public Id AccountId;
	public Account Account;
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
	public Boolean OptionsIncludePassword;
	public Boolean OptionsShowEmail;
	public Boolean OptionsShowFirstName;
	public Boolean OptionsShowLastName;
	public Boolean OptionsShowMobilePhone;
	public Boolean OptionsShowNickname;
	public Boolean OptionsShowUsername;
	public Datetime SystemModstamp;
	public String VerificationMethod;

	public NetworkSelfRegistration clone$() {throw new java.lang.UnsupportedOperationException();}
	public NetworkSelfRegistration clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NetworkSelfRegistration clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NetworkSelfRegistration clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NetworkSelfRegistration clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
