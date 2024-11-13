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
public class CareProgramCampaignChangeEvent extends SObject {
	public static SObjectType$<CareProgramCampaignChangeEvent> SObjectType;
	public static SObjectFields$<CareProgramCampaignChangeEvent> Fields;

	public Id CampaignId;
	public Campaign Campaign;
	public Id CareProgramId;
	public CareProgram CareProgram;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;

	public CareProgramCampaignChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareProgramCampaignChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramCampaignChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramCampaignChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramCampaignChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
