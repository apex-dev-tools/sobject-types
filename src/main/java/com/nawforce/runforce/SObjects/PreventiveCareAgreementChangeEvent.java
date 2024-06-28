/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PreventiveCareAgreementChangeEvent extends SObject {
	public static SObjectType$<PreventiveCareAgreementChangeEvent> SObjectType;
	public static SObjectFields$<PreventiveCareAgreementChangeEvent> Fields;

	public String AdditionalInformation;
	public String BonusMeasureDescription;
	public String BonusMeasureType;
	public Decimal BonusPayout;
	public Object ChangeEventHeader;
	public Id ContractPaymentAgreementId;
	public ContractPaymentAgreement ContractPaymentAgreement;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CurrentMeasurePercent;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public Decimal TargetMeasurePercent;

	public PreventiveCareAgreementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PreventiveCareAgreementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PreventiveCareAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PreventiveCareAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PreventiveCareAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
