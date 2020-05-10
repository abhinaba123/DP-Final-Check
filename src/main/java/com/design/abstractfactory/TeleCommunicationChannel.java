package com.design.abstractfactory;

public class TeleCommunicationChannel 
{
	public Order getOrder(ProductType productType) 
	{
		if (productType == ProductType.ELECTRONIC) 
		{
			return new ElectronicOrder(ChannelType.TELECOMM, productType);
		} 
		
		else if (productType == ProductType.FURNITURE) 
		{
			return new FurnitureOrder(ChannelType.TELECOMM, productType);
		}
		
		else
		{
		return new ToysOrder(ChannelType.TELECOMM, productType);
		}
	}
}
