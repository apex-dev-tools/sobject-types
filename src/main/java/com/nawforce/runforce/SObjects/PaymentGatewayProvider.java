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
public class PaymentGatewayProvider extends SObject {
	public static SObjectType$<PaymentGatewayProvider> SObjectType;
	public static SObjectFields$<PaymentGatewayProvider> Fields;

	public Id ApexAdapterId;
	public ApexClass ApexAdapter;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public String IdempotencySupported;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastViewedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Datetime SystemModstamp;

	public PaymentGateway[] PaymentGateways;

	public PaymentGatewayProvider clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentGatewayProvider clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGatewayProvider clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGatewayProvider clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGatewayProvider clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
